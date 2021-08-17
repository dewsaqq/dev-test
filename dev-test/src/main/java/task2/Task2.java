package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integerList = new ArrayList<>();

        System.out.println("Enter list of integers to pair up to 13 delimited by space: ");
        System.out.println("*to accept write any sign at the end*");
        System.out.println("=====================================");
        while(scanner.hasNextInt()) {
            integerList.add(scanner.nextInt());
        }
        
        PairFinder.findAndPrintPairs(integerList);
    }
}
