package com.epam.mjc.collections.set;

import java.sql.Array;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        TreeSet<String> result = new TreeSet<>();
        TreeSet<String> firstReq = new TreeSet<>();
        firstReq.addAll(secondSet);
        firstReq.addAll(thirdSet);
        for (String element : firstReq) {
            if (firstSet.contains(element) && secondSet.contains(element) && !thirdSet.contains(element)) {
                result.add(element);
            }
            if (!firstSet.contains(element) && !secondSet.contains(element) && thirdSet.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }
}
