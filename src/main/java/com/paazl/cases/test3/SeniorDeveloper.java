package com.paazl.cases.test3;

import com.paazl.cases.test2.Developer;

public class SeniorDeveloper implements Developer {
    @Override
    public void print() {
        System.out.println("You are a senior Java developer");
    }
}
