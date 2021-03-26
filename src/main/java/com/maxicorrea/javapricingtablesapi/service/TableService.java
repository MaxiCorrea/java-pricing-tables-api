package com.maxicorrea.javapricingtablesapi.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.maxicorrea.javapricingtablesapi.domain.Item;
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

  private ItemRepository itemRepository;
  private TableRepository tableRepository;

  @Autowired
  public TableService(
      final ItemRepository itemRepository, 
      final TableRepository tableRepository) {
    this.itemRepository = itemRepository;
    this.tableRepository = tableRepository;
  }

  public List<Table> findAll() {
    List<Table> tablesFromDb = new ArrayList<>();
    for(Table table : tableRepository.findAll()) {
      List<Item> itemTable = itemRepository.findForTable(table);
      table.getItems().addAll(itemTable);
      tablesFromDb.add(table);
    }
    return tablesFromDb;
  }

}
