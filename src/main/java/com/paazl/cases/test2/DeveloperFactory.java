package com.paazl.cases.test2;

public class DeveloperFactory {

    public Developer createDeveloper(int scores) {

        Developer developer;
        if (scores <= 3) {
            developer = new JuniorDeveloper();
        } else if (scores <= 7) {
            developer = new MediorDeveloper();
        } else {
            developer = new SeniorDeveloper();
        }
        return developer;
    }
}
