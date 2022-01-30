package com.harsha.demo.controller;

import com.harsha.demo.model.TestTable;
import com.harsha.demo.repository.TestTableRepository;
import com.harsha.demo.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.notFound;
import static org.springframework.http.ResponseEntity.ok;

@RestController
public class TestController {

    @Autowired
    TestTableRepository testTableRepository;


    @Autowired
    SomeService service;

    @GetMapping("/")
    public ResponseEntity<List> index(@RequestParam(required = false, value = "queryString") String queryString) {
        List<TestTable> testTables = null;
        if (queryString != null && !queryString.isEmpty()) {
            testTables = testTableRepository.findByTitleContaining(queryString);
        } else {
            testTables = testTableRepository.findAll();
        }
        if (testTables == null || testTables.isEmpty()) {
            notFound();
        }
        return ok(service.transformName(testTables));
    }

    @PostMapping("/")
    public ResponseEntity<TestTable> insert(@RequestBody TestTable testTable) {
        return ok(testTableRepository.save(testTable));
    }


}