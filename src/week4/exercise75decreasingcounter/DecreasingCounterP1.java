package week4.exercise75decreasingcounter;

public class DecreasingCounterP1 {
    private int value;
    // object variable that remembers the value of the counter

    public DecreasingCounterP1(int valueAtStart) {
        this.value = valueAtStart;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        value = value - 1;
        // write here the code that decrements the value of counter by one
    }

    // and here the rest of the methods
}



