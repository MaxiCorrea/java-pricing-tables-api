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
        .url("https://maxicorrea.github.io/react-pricing-tables/")
        .build());
    tables.put(Integer.valueOf(2), 
        Table.builder()
        .id(Integer.valueOf(2))
        .color("enterprise")
        .title("Enterprise")
        .price(Integer.valueOf(200))
        .url("https://maxicorrea.github.io/react-pricing-tables/")
        .build());
    tables.put(Integer.valueOf(3), 
        Table.builder()
        .id(Integer.valueOf(3))
        .color("standard")
        .title("Standard")
        .price(Integer.valueOf(400))
        .url("https://maxicorrea.github.io/react-pricing-tables/")
        .build());
    return new ArrayList<>(tables.values());
  }
  
}
