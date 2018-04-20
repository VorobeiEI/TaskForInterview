package com.paazl.cases.test3;

public class DeveloperFactory {

    private Developer developer;

    public Developer createDeveloper(int scores) {

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
