package com.paazl.cases.test3;

import com.paazl.cases.test2.Developer;
import com.paazl.cases.test2.DeveloperFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Singleton {
    private static volatile Singleton instance;
    private static Scanner scanner;
    private static DeveloperFactory developerFactory;
    private static Developer developer;

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

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }


    public int workWithUser() {

        int countAnswers = 0;
        int scores = 0;
        char acceptedAnswer;
        developerFactory = new DeveloperFactory();

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
            System.out.println("Your " + countAnswers + " answers accepted!");
        }

        return scores;
    }

    //validation of what user has entered
    private static char initialize() {
        scanner = new Scanner(System.in);
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
