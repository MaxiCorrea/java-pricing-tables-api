package com.maxicorrea.javapricingtablesapi.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.maxicorrea.javapricingtablesapi.domain.Table;
import com.maxicorrea.javapricingtablesapi.service.TableService;

/**
 * 
 * @author mxcorrea
 *
 */
@RestController
public class TableController {

  private TableService tableService;
  
  @Autowired
  public TableController(
      final TableService tableService) {
    this.tableService = tableService;
  }
  
  @CrossOrigin(origins = "*", allowedHeaders = "*")
  @GetMapping("/tables")
  public List<Table> tables() {
    return tableService.findAll();
  }
  
}
