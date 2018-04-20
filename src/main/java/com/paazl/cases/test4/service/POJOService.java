package com.paazl.cases.test4.service;

import com.paazl.cases.test4.entity.POJO;

import java.util.List;

public class POJOService {

    public static List<POJO> actionsWithPOJO(List<POJO> pojoList) {
        //Increasing each POJO's "number" field by 1, and move the "date" field one day ahead,
        pojoList.forEach(p -> {
            p.setNumber(p.getNumber() + 1);
            p.setDate(p.getDate().plusDays(1));
        });
        return pojoList;
    }
}
