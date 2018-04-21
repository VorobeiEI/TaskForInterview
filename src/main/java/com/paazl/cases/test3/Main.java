package com.paazl.cases.test3;

public class Main {

    /*
     * Implement a main method that is functionally identical to Test #2. In
     * this case, use a Singleton that poses the questions and gathers the answers.
     */
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        DeveloperFactory developerFactory = new DeveloperFactory();

        int scores = singleton.workWithUser();// the number of scores

        System.out.println("Your scores are: " + scores);

        Developer developer = developerFactory.createDeveloper(scores);
        developer.print();

    }

}