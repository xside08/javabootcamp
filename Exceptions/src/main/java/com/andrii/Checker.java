package com.andrii;

import com.andrii.exceptions.ExceptionOverHundred;
import com.andrii.exceptions.NumberOdd;
import com.andrii.exceptions.ObjectExisting;
import com.andrii.exceptions.WordIsIncorrect;

import java.util.Objects;

public class Checker {

    public void checkForValidName(String data) throws WordIsIncorrect {
        if(data.equals("Palindrome")) {
            System.out.println("You are right, word is \"palindrome\" ");
        } else {
            throw new WordIsIncorrect("Word isn't palindrome!");
        }
    }

    public void checkIfNumberOdd(int number) throws NumberOdd {
        if(number % 2 == 0) {
            System.out.println("number is odd");
        } else {
            throw new NumberOdd("your number isn't odd");
        }
    }

    public void checkIfIntMoreHundred(int number) throws ExceptionOverHundred {
        if(number >= 100) {
            throw new ExceptionOverHundred("Your number is bigger than 100");
        }
    }

    public void checkObjectExist(Object obj) throws ObjectExisting {
        if(Objects.isNull(obj)) {
            throw new ObjectExisting("Your object is null");
        }
        System.out.println("Object is defined");
    }
}


