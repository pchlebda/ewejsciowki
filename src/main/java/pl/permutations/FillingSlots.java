package pl.permutations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class FillingSlots {

    List<List<Integer>> permutationsOfFilledSlots(Set<Integer> values, int numSlots) {
        List<List<Integer>> permutation = permutation(values, numSlots);
        Set<List<Integer>> result = new LinkedHashSet<List<Integer>>();

        for (List<Integer> list : permutation) {
            Collections.sort(list);
            result.add(list);
        }

        return new ArrayList<List<Integer>>(result);
    }

    private List<List<Integer>> permutation(Set<Integer> values, int numSlots) {
        if (numSlots == 1) {
            List<List<Integer>> result = new ArrayList<List<Integer>>();
            for (Integer value : values) {
                List list = new ArrayList();
                list.add(value);
                result.add(list);
            }

            return result;
        }
        List<List<Integer>> permutation = permutation(values, numSlots - 1);
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for (List<Integer> list : permutation) {
            for (Integer value : values) {
                List<Integer> curList = new ArrayList<Integer>(list);
                curList.add(value);
                result.add(curList);
            }
        }
        return result;
    }
}
