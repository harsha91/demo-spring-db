package com.harsha.demo.service;

import com.harsha.demo.model.TestTable;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = SomeService.class)
public class SomeServiceTest {

    @Autowired
    SomeService someService;

    @Test
    public void testTransformName() {
        List<TestTable> input = new ArrayList<>();
        input.add(new TestTable(1, "test", "testDesc"));
        List<TestTable> output = someService.transformName(input);
        assertEquals("TEST", output.get(0).getTitle());
    }

    @Test
    public void testNullTransformName() {
        List<TestTable> output = someService.transformName(null);
        assertEquals(null, output);
    }
}
