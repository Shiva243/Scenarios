package com.scenarios.collection;

import java.util.List;

public class Streams {

    public int sumOfInt(List<Integer> list){
       return list.stream().filter(i -> i<5).mapToInt(a->a).sum();
    }
}
