package com.andrii;

public class OutOfMemoryCheck {

    public void test (int n) {
        int[] foo;
        try {
            foo = new int[n];
            test(n * 2);
        }
        catch (OutOfMemoryError e) {
            test((n+1) / 2);
        }
    }
}
