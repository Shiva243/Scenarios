package com.scenarios.collection;

import java.util.List;

public class Streams {

    public int sumOfInt(List<Integer> list){
       return list.stream().filter(i -> i<5).mapToInt(a->a).sum();
    }

    public void seqStream(List<Integer> list){
        list.stream().filter(l->l>1).forEach(p->System.out.print("Seq Stream ["+p+"]"));
    }
    public void parStream(List<Integer> list){
        list.parallelStream().filter(l->l>1).forEach(p->System.out.print("Par Stream ["+p+"]"));
    }
}
