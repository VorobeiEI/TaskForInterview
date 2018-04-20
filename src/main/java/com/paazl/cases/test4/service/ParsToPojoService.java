package com.paazl.cases.test4.service;

import com.paazl.cases.test4.entity.POJO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ParsToPojoService {

    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static POJO pojo;
    //the First row in file that cant be POJO - name;city;country;number;date
    public static String nonPOJORow;

    //Parsing List<String> to List<POJO>
    public static List<POJO> parsFromStringToPojo(List<String> stringList) {
        List<POJO> pojoList = new ArrayList<>();
        nonPOJORow = stringList.get(0);
        for (int i = 1; i < stringList.size(); i++) {

            String[] parse = stringList.get(i).split(";");

            pojo = new POJO();
            pojo.setName(parse[0]);
            pojo.setCity(parse[1]);
            pojo.setCountry(parse[2]);
            pojo.setNumber(Integer.parseInt(parse[3]));
            pojo.setDate(LocalDate.parse(parse[4], dateTimeFormatter));
            pojoList.add(pojo);
        }

        return pojoList;
    }
}
