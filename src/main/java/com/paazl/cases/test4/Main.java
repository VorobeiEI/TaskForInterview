package com.paazl.cases.test4;

import com.paazl.cases.test4.entity.POJO;
import com.paazl.cases.test4.service.FileReaderService;
import com.paazl.cases.test4.service.FileWriterService;
import com.paazl.cases.test4.service.POJOService;
import com.paazl.cases.test4.service.ParsToPojoService;

import java.util.List;

public class Main {

    /*
     * Read and parse "testdata.csv" (located in
     * src/main/resources/com/paazl/cases/test4) into a list of POJOs. Increase
     * each POJO's "number" field by 1, and move the "date" field one day ahead.
     * Write the results to a file named "testdata.new.csv".
     */
    public static void main(String[] args) {
        //Reading file "testdata.csv" and saving them to List<String>
        List<String> stringList = FileReaderService.readFromFile();
        //Parsing List<String> to List<POJO>
        List<POJO> pojoList = ParsToPojoService.parsFromStringToPojo(stringList);
        //Increasing each POJO's "number" field by 1, and move the "date" field one day ahead, saving it to new List<POJO>
        List<POJO> newListPOJO = POJOService.actionsWithPOJO(pojoList);
        //Writing newPOJOS to file testdata.new.csv
        FileWriterService.writeToFile(newListPOJO, ParsToPojoService.nonPOJORow);

    }

}
