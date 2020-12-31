package com.scenarios;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.net.*;
//import com.google.gson.*;
//Extracting the response from the rest endpont.
public class Solution {
    /*
     * Complete the function below.
     * Base url: https://jsonmock.hackerrank.com/api/movies/search/?Title=
     */
//
    static String[] getMovieTitles(String substr) {

        List<String> movieNames = new ArrayList<>();
        HttpURLConnection conn = null;
        BufferedReader br = null;
        try {
            StringBuilder sb = new StringBuilder("https://jsonmock.hackerrank.com/api/movies/search/?Title=");
            sb.append(substr);
            URL url = new URL(sb.toString());
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));
            int i = 1;
            /*Gson gson = new Gson();
            MovieTitles mt = gson.fromJson(br, MovieTitles.class);
            for (Data data : mt.getData()) {
                movieNames.add(data.getTitle());
            }
            if (Integer.parseInt(mt.getTotal_pages()) > i) {
                i++;
                sb.append("&page=");
                sb.append(i);
                url = new URL(sb.toString());
                conn = (HttpURLConnection) url.openConnection();
                br = new BufferedReader(new InputStreamReader(
                        (conn.getInputStream())));
                mt = gson.fromJson(br, MovieTitles.class);
                for (Data data : mt.getData()) {
                    movieNames.add(data.getTitle());
                }
            }*/
            Collections.sort(movieNames);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != conn) {
                conn.disconnect();
            }
            if (null != br) {
                try {
                    br.close();
                } catch (IOException ie) {

                }

            }
        }
        return movieNames.stream().toArray(String[]::new);
    }

    class MovieTitles {
        private String page;
        private String per_page;
        private String total;
        private String total_pages;
        private List<Data> data;

        public String getPage() {
            return page;
        }

        public void setPage(String page) {
            this.page = page;
        }

        public String getPer_page() {
            return per_page;
        }

        public void setPer_page(String per_page) {
            this.per_page = per_page;
        }

        public String getTotal() {
            return total;
        }

        public void setTotal(String total) {
            this.total = total;
        }

        public String getTotal_pages() {
            return total_pages;
        }

        public void setTotal_pages(String total_pages) {
            this.total_pages = total_pages;
        }

        public List<Data> getData() {
            return data;
        }

        public void setData(List<Data> data) {
            this.data = data;
        }
    }

    class Data {
        private String Title;
        private String Year;
        private String imdbID;
        private String total_pages;

        public String getTitle() {
            return Title;
        }

        public void setTitle(String title) {
            Title = title;
        }

        public String getYear() {
            return Year;
        }

        public void setYear(String year) {
            Year = year;
        }

        public String getImdbID() {
            return imdbID;
        }

        public void setImdbID(String imdbID) {
            this.imdbID = imdbID;
        }

        public String getTotal_pages() {
            return total_pages;
        }

        public void setTotal_pages(String total_pages) {
            this.total_pages = total_pages;
        }
    }
}