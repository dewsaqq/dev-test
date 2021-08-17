package task1;

import java.util.List;
import java.util.TreeSet;

/**
 * Class to output sorted list of distinct integers. It transforms List of integers to set, which is distinct by
 * definition. It also uses TreeSet collection which is already sorted and has satisfactory time complexity
 * of O(logn) for its all operations.
 */
public class DistinctSorter {

    private DistinctSorter() {}

    private static TreeSet<Integer> distinctSort(List<Integer> integerList) {
        TreeSet<Integer> sortedDistinctList = new TreeSet<>(integerList);
        return sortedDistinctList;
    }

    public static void sortAndPrintList(List<Integer> integerList) {
        TreeSet<Integer> sortedList = distinctSort(integerList);
        System.out.println(sortedList);
        System.out.println("count: " + integerList.size());
        System.out.println("distinct: " + sortedList.size());
        System.out.println("min: " + sortedList.first());
        System.out.println("max: " + sortedList.last());
    }
}
