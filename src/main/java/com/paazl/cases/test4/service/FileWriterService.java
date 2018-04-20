package com.paazl.cases.test4.service;

import com.paazl.cases.test4.entity.POJO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileWriterService {
    private static File file;
    private static FileWriter fileWriter;

    private static final String newFile = "src/main/resources/com/paazl/cases/test4/testdata.new.csv";

    //Writing newPOJOS to file testdata.new.csv
    public static void writeToFile(List<POJO> newListPOJO, String firstRow) {
        file = new File(newFile);
        try {
            fileWriter = new FileWriter(file);

            fileWriter.write(firstRow + '\n');

            newListPOJO.forEach(pojo -> {
                try {
                    fileWriter.write(pojo.toString() + '\n');
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            fileWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
