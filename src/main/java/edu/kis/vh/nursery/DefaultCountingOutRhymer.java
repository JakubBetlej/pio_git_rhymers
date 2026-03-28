package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int returned = -1;
    private static final int capasity = 12;
    private final int[] numbers = new int[capasity];

    private int total = returned;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == returned;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return returned;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return returned;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }
}
