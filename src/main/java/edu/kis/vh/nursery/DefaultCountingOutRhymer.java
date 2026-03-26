package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int returned = -1;
    public static final int capasity = 12;
    private int[] numbers = new int[capasity];

    public int total = returned;

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

}
