package com.paazl.cases.test4.service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class FileReaderService {

    private static final String fileName = "src/main/resources/com/paazl/cases/test4/testdata.csv";

    //Reading file "testdata.csv" and saving them to List<String>
    public static List<String> readFromFile() {
        List<String> lines = Collections.emptyList();

        try {
            lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
