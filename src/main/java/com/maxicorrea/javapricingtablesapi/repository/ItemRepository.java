package com.maxicorrea.javapricingtablesapi.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.maxicorrea.javapricingtablesapi.domain.Item;
import com.maxicorrea.javapricingtablesapi.domain.Table;
import com.maxicorrea.javapricingtablesapi.utils.RepositoryUtils;
/**
 * 
 * @author mxcorrea
 *
 */
@Repository
public class ItemRepository {

  private static final String FIND_QUERY = "SELECT * FROM pricing_table_item WHERE pricing_table_id=%d";
  private JdbcTemplate jdbcTemplate;

  @Autowired
  public ItemRepository(
      final JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  public List<Item> findForTable(
      final Table table) {
    try {
      final Integer idTable = table.getId();
      final String sql = String.format(FIND_QUERY, idTable);
      List<Item> itemsForTable = new ArrayList<>();
      jdbcTemplate.queryForList(sql).forEach((args)-> itemsForTable.add(
          Item.createOf(
              RepositoryUtils.toInteger(args, "id"),
              RepositoryUtils.toString(args, "details"))));
      return itemsForTable;
    } catch(Exception ex) {
      ex.printStackTrace();
      return Collections.emptyList();
    }
  }
  
}
