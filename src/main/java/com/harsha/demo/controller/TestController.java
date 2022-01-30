package com.harsha.demo.controller;

import com.harsha.demo.model.TestTable;
import com.harsha.demo.repository.TestTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
public class TestController {

    @Autowired
    TestTableRepository testTableRepository;

    @GetMapping("/")
    public ResponseEntity<List> index(@RequestParam(required = true, value = "queryString") String queryString) {
        return ok(testTableRepository.findByTitleContaining(queryString));
    }

    @PostMapping("/")
    public ResponseEntity<TestTable> insert(@RequestBody TestTable testTable) {
        return ok(testTableRepository.save(testTable));
    }


}