package task2;

/**
 * Wrapper class for pair of numbers.
 */
public class Pair {
    private final int firstNumber, secondNumber;

    public Pair(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void printPair() {
        System.out.println(firstNumber + " " + secondNumber);
    }
}
