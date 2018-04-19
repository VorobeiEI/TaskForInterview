package com.paazl.cases.test3;

public class Main {

    private static Singleton singleton;
	
    /*
     * Implement a main method that is functionally identical to Test #2. In
     * this case, use a Singleton that poses the questions and gathers the answers.
     */
    public static void main(String[] args) {

        singleton = Singleton.getInstance();

        int scores = singleton.workWithUser();
   
    }
    
}