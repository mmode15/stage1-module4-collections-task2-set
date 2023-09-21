package com.epam.mjc.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();
        for (Integer i : sourceList) {
            if (i % 2 == 0) {
                Integer currVal = i;
                result.add(currVal);
                do {
                    currVal /= 2;
                    result.add(currVal);
                } while (currVal % 2 == 0);
            } else {
                result.add(i);
                result.add(i * 2);
            }
        }
        return result;
    }
}
