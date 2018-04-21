package com.paazl.cases.test2;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    @SuppressWarnings("serial")
    private static final Map<String, Character> QUESTIONS = new HashMap<String, Character>() {
        {
            put("A Thread is a process", 'N');
            put("A List cannot contain duplicates", 'N');
            put("A Set can contain duplicates", 'N');
            put("Java is platform independent", 'Y');
            put("Java supports copy constructors like C++", 'Y');
            put("The primitive data types supported by the Java programming language are: byte, short, int, long, float, double, boolean, char", 'Y');
            put("Constructor overloading is similar to method overloading in Java", 'N');
            put("The purpose of garbage collection in Java is to reclaim and reuse objects which are no longer used", 'Y');
            put("Autoboxing is the automatic conversion made by the Java compiler between the primitive types and their corresponding object wrapper classes", 'Y');
            put("JDBC is an abstraction layer that allows users to choose between databases", 'Y');
            put("Java supports the usage of pointers", 'N');
        }
    };

    /*
     * Implement a main method that is functionally identical to Test #1. In
     * this case, use a DeveloperFactory that is able to produce 3 types of
     * developers that implement a "print" method. The Factory should have a
     * create method that takes the user's score as an argument.
     */
    public static void main(String[] args) throws IOException {

        int countAnswers = 0; // count for whole number of answers
        int scores = 0; //count of right given answers
        char acceptedAnswer; //accepted answer of user after validation
        DeveloperFactory developerFactory = new DeveloperFactory();

        for (String a : QUESTIONS.keySet()) {
            System.out.println(a);
        }

        System.out.println();
        System.out.println("Please give your answers one by one, type Y/N and hit enter after each answer.\nRegister doesnt matter");

        for (String a : QUESTIONS.keySet()) {

            acceptedAnswer = initialize();

            if (QUESTIONS.get(a).equals(acceptedAnswer)) {
                scores++;
            }
            countAnswers++;
            System.out.println("Your " + countAnswers + " answer accepted!");
        }

        System.out.println("Your scores are: " + scores);
        Developer developer = developerFactory.createDeveloper(scores);
        developer.print();

    }

    //validation of what user has entered
    private static char initialize() {
        Scanner scanner = new Scanner(System.in);
        String answer = null;
        boolean accept = false;
        while (!accept) {
            answer = scanner.next().toUpperCase();
            if (answer.charAt(0) == 'Y' || answer.charAt(0) == 'N') {
                accept = true;
            } else {
                System.out.println("Please type Y/N");
                accept = false;
            }
        }
        return answer.charAt(0);
    }

}
