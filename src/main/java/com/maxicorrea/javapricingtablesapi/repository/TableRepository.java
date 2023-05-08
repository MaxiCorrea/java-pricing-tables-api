package com.maxicorrea.javapricingtablesapi.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.maxicorrea.javapricingtablesapi.domain.Table;
/**
 * 
 * @author mxcorrea
 *
 */
@Repository
public class TableRepository {

  public List<Table> findAll(){
    Map<Integer,Table> tables = new HashMap<>();
    tables.put(Integer.valueOf(1), 
        Table.builder()
        .id(Integer.valueOf(1))
        .color("basic")
        .title("Basic")
        .price(Integer.valueOf(140))
        .url("")
        .build());
    tables.put(Integer.valueOf(2), 
        Table.builder()
        .id(Integer.valueOf(2))
        .color("basic")
        .title("Basic")
        .price(Integer.valueOf(140))
        .url("")
        .build());
    tables.put(Integer.valueOf(3), 
        Table.builder()
        .id(Integer.valueOf(3))
        .color("basic")
        .title("Basic")
        .price(Integer.valueOf(140))
        .url("")
        .build());
    return new ArrayList<>(tables.values());
  }
  
}
