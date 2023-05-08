package com.maxicorrea.javapricingtablesapi.repository;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.maxicorrea.javapricingtablesapi.domain.Item;
import com.maxicorrea.javapricingtablesapi.domain.Table;
/**
 * 
 * @author mxcorrea
 *
 */
@Repository
public class ItemRepository {

  public List<Item> findForTable(
      final Table table) {
    Map<Integer , List<Item>> items = new HashMap<>();
    items.put(Integer.valueOf(1), Arrays.asList(
          Item.createOf(1, "50 Emails"),
          Item.createOf(2, "5GB Disk Space"),
          Item.createOf(3, "5GB Bandwidth"),
          Item.createOf(4, "Unlimited Domains")
        ));
    items.put(Integer.valueOf(2), Arrays.asList(
        Item.createOf(1, "50 Emails"),
        Item.createOf(2, "10GB Disk Space"),
        Item.createOf(3, "10GB Bandwidth"),
        Item.createOf(4, "Unlimited Domains")
      ));
    items.put(Integer.valueOf(3), Arrays.asList(
        Item.createOf(1, "50 Emails"),
        Item.createOf(2, "6GB Disk Space"),
        Item.createOf(3, "6GB Bandwidth"),
        Item.createOf(4, "Unlimited Domains")
      ));
    return items.get(table.getId());
  }
  
}
