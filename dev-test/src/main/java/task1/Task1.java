package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
