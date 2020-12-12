package com.andrii;

import com.andrii.exceptions.ExceptionOverHundred;
import com.andrii.exceptions.NumberOdd;
import com.andrii.exceptions.ObjectExisting;
import com.andrii.exceptions.WordIsIncorrect;

import java.util.LinkedList;
import java.util.List;

public class Main {
    static Object nullObj;

    public static void main(String[] args) throws Exception {

        OutOfMemoryCheck outOfMemoryCheck = new OutOfMemoryCheck();
        outOfMemoryCheck.test(1);

        StackOFlow stuck = new StackOFlow();
        stuck.foo(6);


        Checker checker = new Checker();
        try {
            checker.checkIfIntMoreHundred(670);
        } catch (ExceptionOverHundred e) {
            System.err.println(e.getMessage());
        }

        try {
            checker.checkObjectExist(nullObj);
        } catch (ObjectExisting e) {
            System.err.println(e.getMessage());
        }

        try {
            checker.checkForValidName("Polina");
        } catch (WordIsIncorrect e) {
            System.err.println(e.getMessage());
        }

        try {
            checker.checkIfNumberOdd(64);
        } catch (NumberOdd e) {
            System.err.println(e.getMessage());
        }


        long[][] array = new long[Integer.MAX_VALUE][Integer.MAX_VALUE];
        List<int[]> list = new LinkedList<int[]>();
        while (true) {
            list.add(new int[65536]);
        }
    }
}