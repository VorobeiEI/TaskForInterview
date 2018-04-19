package com.paazl.cases.test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
	 * Implement the main method:
	 * * Show the user the questions on a console and collect the answers.
	 * * If the user scores 0-3 points, print "You are a junior Java developer".
	 * * If the user scores 4-7 points, print "You are a medior Java developer".
	 * * If the user scores 8-10 points, print "You are a senior Java developer".
	 */
	public static void main(String[] args) {

		int countAnswers = 0;
		int scores = 0;
		String answer;

		for(String a : QUESTIONS.keySet()) {

			System.out.println(a);
		}

		System.out.println(QUESTIONS.size());

		Scanner scanner = new Scanner(System.in);

		for(String a : QUESTIONS.keySet()) {
			if(countAnswers == QUESTIONS.size()) {
				break;
			}
			answer = scanner.next();
			if(QUESTIONS.get(a).equals(answer.charAt(0))){
				scores++;
			}
			countAnswers++;
		}

		if(scores<=3) {
			System.out.println("You are a junior Java developer");
		} else if( scores >= 4 & scores <=7) {
			System.out.println("You are a medior Java developer");
		} else {
			System.out.println("You are a senior Java developer");
		}
     }
}