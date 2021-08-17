package task2;

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
