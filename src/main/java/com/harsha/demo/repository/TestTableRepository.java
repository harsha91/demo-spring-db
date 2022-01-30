package com.harsha.demo.repository;

import com.harsha.demo.model.TestTable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface TestTableRepository extends PagingAndSortingRepository<TestTable, Long> {
    List<TestTable> findByTitleContaining(String title);
    List<TestTable> findAll();
}
