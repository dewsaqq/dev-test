package task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PairFinder {
    private static final int DESIRED_SUM = 13;

    private PairFinder() { }

    private static List<Pair> findPairs(List<Integer> integerList) {
        Collections.sort(integerList);
        List<Pair> pairList = new ArrayList<>();
        for(int i = 0; i < integerList.size() - 1; i++){
            if(integerList.get(i) > DESIRED_SUM) break;
            for(int j = i + 1; j < integerList.size(); j++) {
                if(integerList.get(i) + integerList.get(j) == DESIRED_SUM) {
                    pairList.add(new Pair(integerList.get(i), integerList.get(j)));
                }
                else if(integerList.get(i) + integerList.get(j) > DESIRED_SUM) break;
            }
        }

        return pairList;
    }

    public static void findAndPrintPairs(List<Integer> integerList) {
        findPairs(integerList).forEach(Pair::printPair);
    }
}
