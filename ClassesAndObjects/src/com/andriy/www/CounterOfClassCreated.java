package com.andriy.www;

public class CounterOfClassCreated {
    static int count = 0;

    {
        count += 1;
    }
}
