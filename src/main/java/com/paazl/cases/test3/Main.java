package com.paazl.cases.test3;

public class Main {

    private static Singleton singleton;
    private static DeveloperFactory developerFactory;
    private static Developer developer;

    /*
     * Implement a main method that is functionally identical to Test #2. In
     * this case, use a Singleton that poses the questions and gathers the answers.
     */
    public static void main(String[] args) {

        singleton = Singleton.getInstance();
        developerFactory = new DeveloperFactory();

        int scores = singleton.workWithUser();// the number of scores

        System.out.println("Your scores are: " + scores);

        developer = developerFactory.createDeveloper(scores);
        developer.print();

    }

}