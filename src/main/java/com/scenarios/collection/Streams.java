package com.scenarios.collection;

import lombok.extern.java.Log;

import java.util.*;
import java.util.stream.Collectors;
@Log
public class Streams {

    public int sumOfInt(List<Integer> list){
       return list.stream().filter(i -> i<5).mapToInt(a->a).sum();
    }

    public void seqStream(List<Integer> list){
        list.stream().filter(l->l>1).forEach(p->log.info("Seq Stream ["+p+"]"));
    }
    public void parStream(List<Integer> list){
        list.parallelStream().filter(l->l>1).forEach(p->log.info("Par Stream ["+p+"]"));
    }
    public void listCompare(){
        final Map<Integer, List<Employee>> emp = Util.getEmpList().stream()
                .collect(Collectors.groupingBy(Employee::getId, Collectors.toList()));
        List<Items> list = new ArrayList<>();
        Util.getListOfInt().stream().forEach(e->Util.getEmpList().stream()
                .filter(em-> em.getId() == e).forEach(em->{
                    list.add(new Items(em.getName(),Double.valueOf(e)));
                }));
        System.out.print(list);

    }
    public  Map<String, Object> iterateMap(){
        Map<String,List<Items>> map=
                new HashMap<>();
        List<Items> il1= new ArrayList<>();
        il1.add(new Items("Telvision", 13000.0));
        il1.add(new Items("Sofa", 11000.0));

        List<Items> il2= new ArrayList<>();
        il2.add(new Items("Oven", 5000.0));
        il2.add(new Items("Refrigirator", 17000.0));

        List<Items> il3= new ArrayList<>();
        il3.add(new Items("WashingMachine", 19000.0));
        il3.add(new Items("Chairs", 19000.0));

        Comparator<Items> ci= (i1,i2)->
                i1.getItemName().compareToIgnoreCase(i2.getItemName());
        map.put("1146", il1);
        map.put("1147", il2);
        map.put("1148", il3);
        log.info("Map info ["+map+"]");

        return map
                .entrySet().stream()
                .collect(Collectors
                        .toMap(Map.Entry::getKey,
                                v->v.getValue().stream().
                                        sorted(ci).collect(Collectors.toList())));
    }
}

 class Items{

    private String itemName;
    private Double itemPrice;
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


    public Double getItemPrice() {
        return itemPrice;
    }
    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }
    public Items(){
    }

    public Items(String itemName,Double price){
        this.itemName=itemName;
        this.itemPrice=price;
    }
    public String toString(){

        return itemName+" "+itemPrice;
    }
}