package com.paazl.cases.test1;

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

    private static final String JUNIOR = "You are a junior Java developer";
    private static final String MEDIOR = "You are a medior Java developer";
    private static final String SENIOR = "You are a senior Java developer";

    /*
     * Implement the main method:
     * * Show the user the questions on a console and collect the answers.
     * * If the user scores 0-3 points, print "You are a junior Java developer".
     * * If the user scores 4-7 points, print "You are a medior Java developer".
     * * If the user scores 8-10 points, print "You are a senior Java developer".
     */
    public static void main(String[] args) {

        int countAnswers = 0; // count for whole number of answers
        int scores = 0; //count of right given answers
        char acceptedAnswer; //accepted answer of user after validation

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
        if (scores <= 3) {
            System.out.println(JUNIOR);
        } else if (scores <= 7) {
            System.out.println(MEDIOR);
        } else {
            System.out.println(SENIOR);
        }
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