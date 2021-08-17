package task1;

import java.util.List;
import java.util.TreeSet;

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
