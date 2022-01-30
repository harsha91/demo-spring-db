package com.harsha.demo.service;


import com.harsha.demo.model.TestTable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SomeService {

    public List<TestTable> transformName(List<TestTable> testTableList) {
        if (testTableList == null || testTableList.isEmpty()) {
            return testTableList;
        }
        List<TestTable> finalTableList = testTableList.stream()
                .peek(testTable -> testTable.setTitle(testTable.getTitle().toUpperCase()))
                .collect(Collectors.toList());
        return finalTableList;
    }
}
