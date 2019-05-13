package com.scenarios.json;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
public class JSONReader {
    public static void main(String[] args) throws Exception{
        Object obj = new JSONParser().parse(new FileReader("/Users/nisum/Documents/Scenarios/src/main/java/com/scenarios/json/JSONExample.json"));

        // typecasting obj to JSONObject
        JSONObject jo = (JSONObject) obj;

        // getting firstName and lastName
        String firstName = (String) jo.get("firstName");
        String lastName = (String) jo.get("lastName");

        // getting age
        long age = (long) jo.get("age");
        // getting address
        JSONObject add = (JSONObject)jo.get("address");
        JSONArray pho = (JSONArray)add.get("phoneNumbers");
        add.remove("phoneNumbers");
        jo.put("phoneNumbers",pho);
        Map address = ((Map)jo.get("address"));



        // iterating address Map
        Iterator<Map.Entry> itr1 = address.entrySet().iterator();
        while (itr1.hasNext()) {
            Map.Entry pair = itr1.next();
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }

        // getting phoneNumbers
        JSONArray ja = (JSONArray) jo.get("phoneNumbers");
        // iterating phoneNumbers
        Iterator itr2 = ja.iterator();

        while (itr2.hasNext())
        {
            itr1 = ((Map) itr2.next()).entrySet().iterator();
            while (itr1.hasNext()) {
                Map.Entry pair = itr1.next();
                System.out.println(pair.getKey() + " : " + pair.getValue());
            }
        }
    }


}
