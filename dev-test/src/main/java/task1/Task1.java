package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Best way of implementing distinct integer sorter is to transform List of integers to set, which is distinct by
 * definition. Beside of that, we can use TreeSet which is already sorted as well and has satisfactory time complexity
 * of O(logn) for all operations.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integerList = new ArrayList<>();

        System.out.println("Enter list of integers to distinct sort: ");
        System.out.println("***to accept write any sign at the end***");
        System.out.println("=====================================");
        while(scanner.hasNextInt()) {
            integerList.add(scanner.nextInt());
        }

        DistinctSorter.sortAndPrintList(integerList);
    }
}
