package com.scenarios.collection;

import com.scenarios.collection.streams.Streams;
import lombok.extern.java.Log;

import java.util.ArrayList;
import java.util.List;
@Log
public class ListSplittoMutiple {

    public static void main(String[] args) {
        //log.info(splitList(Util.getListOfString(),4));
        Streams s = new Streams();
        s.seqStream(Util.getListOfInt());
        s.parStream(Util.getListOfInt());
        Util.getSettOfString();
    }
    private static List<List<String>> splitList(final List<String> list, final int maxElement) {
        final List<List<String>> result = new ArrayList<>();
        final int div = list.size() / maxElement;
        for (int i = 0; i <= div; i++) {
            final int startIndex = i * maxElement;
            if (startIndex >= list.size()) {
                return result;
            }
            final int endIndex = (i + 1) * maxElement;
            if (endIndex < list.size()) {
                result.add(list.subList(startIndex, endIndex));
            } else {
                result.add(list.subList(startIndex, list.size()));
            }
        }
        return result;
    }
}
