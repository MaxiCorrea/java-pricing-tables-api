package com.maxicorrea.javapricingtablesapi.domain;

import java.util.List;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public final class Table {
  private Integer id;
  private String title;
  private String color;
  private Integer price;
  private String url;
  private List<Item> items;
}
