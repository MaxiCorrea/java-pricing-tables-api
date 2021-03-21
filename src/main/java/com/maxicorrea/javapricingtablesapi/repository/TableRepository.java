package com.maxicorrea.javapricingtablesapi.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.maxicorrea.javapricingtablesapi.domain.Table;
import com.maxicorrea.javapricingtablesapi.utils.RepositoryUtils;
/**
 * 
 * @author mxcorrea
 *
 */
@Repository
public class TableRepository {

  private static final String FIND_ALL_QUERY = "SELECT * FROM pricing_table";
  private final JdbcTemplate template;

  @Autowired
  public TableRepository(
      final JdbcTemplate template) {
    this.template = template;
  }

  public final List<Table> findAll(){
    try {
      List<Table> tablesFromDb = new ArrayList<>();
      template.queryForList(FIND_ALL_QUERY).forEach((args)-> 
        tablesFromDb.add(Table.builder()
            .id(RepositoryUtils.toInteger(args, "id"))
            .color(RepositoryUtils.toString(args, "color"))
            .title(RepositoryUtils.toString(args, "title"))
            .price(RepositoryUtils.toInteger(args, "price"))
            .url(RepositoryUtils.toString(args, "purcharse_url"))
            .build()));
      return tablesFromDb;
    } catch(Exception ex) {
      ex.printStackTrace();
      return Collections.emptyList();
    }
  }
  
}
