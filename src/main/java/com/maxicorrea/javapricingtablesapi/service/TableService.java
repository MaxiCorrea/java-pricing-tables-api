package com.maxicorrea.javapricingtablesapi.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.maxicorrea.javapricingtablesapi.domain.Table;
import com.maxicorrea.javapricingtablesapi.repository.ItemRepository;
import com.maxicorrea.javapricingtablesapi.repository.TableRepository;
/**
 * 
 * @author mxcorrea
 *
 */
@Service
public class TableService {

  private final ItemRepository itemRepository;
  private final TableRepository tableRepository;

  @Autowired
  public TableService(
      final ItemRepository itemRepository, 
      final TableRepository tableRepository) {
    this.itemRepository = itemRepository;
    this.tableRepository = tableRepository;
  }

  public final List<Table> findAll() {
    List<Table> tablesFromDb = new ArrayList<>();
    tableRepository.findAll().forEach(
        (table) -> itemRepository.findForTable(table).forEach(
            (item) -> table.addNewItem(item)));
    return tablesFromDb;
  }

}
