package com.scenarios.collection;

import java.util.ArrayList;
import java.util.List;

public class ListSplittoMutiple {

    public static void main(String[] args) {
        System.out.println(splitList(Util.getListOfString(),5));
    }
    private static List<List<String>> splitList(final List<String> list, final int maxElement) {

        final List<List<String>> result = new ArrayList<List<String>>();

        final int div = list.size() / maxElement;

        System.out.println(div);

        for (int i = 0; i <= div; i++) {

            final int startIndex = i * maxElement;

            if (startIndex >= list.size()) {
                return result;
            }
            final int endIndex = (i + 1) * maxElement;
            System.out.println(endIndex);
            if (endIndex < list.size()) {
                result.add(list.subList(startIndex, endIndex));
            } else {
                result.add(list.subList(startIndex, list.size()));
            }

        }

        return result;
    }
}
