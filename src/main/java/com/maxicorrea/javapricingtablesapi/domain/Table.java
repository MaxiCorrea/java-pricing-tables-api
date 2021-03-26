package com.maxicorrea.javapricingtablesapi.domain;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author mxcorrea
 *
 */
public final class Table {

  public static final Builder builder() {
    return new Builder();
  }
  
  public static final class Builder {
    
    private Integer id;
    private String title;
    private String color;
    private Integer price;
    private String url;
    private List<Item> items = new ArrayList<>();

    public Builder id(
        final Integer id) {
      this.id = id;
      return this;
    }

    public Builder title(
        final String title) {
      this.title = title;
      return this;
    }

    public Builder color(
        final String color) {
      this.color = color;
      return this;
    }

    public Builder price(
        final Integer price) {
      this.price = price;
      return this;
    }

    public Builder url(
        final String url) {
      this.url = url;
      return this;
    }

    public Builder items(
        final List<Item> items) {
      this.items = items;
      return this;
    }

    public Table build() {
      return new Table(this);
    }

  }

  private final Integer id;
  private final String title;
  private final String color;
  private final Integer price;
  private final String url;
  private final List<Item> items;

  private Table(Builder builder) {
    id = builder.id;
    title = builder.title;
    color = builder.color;
    price = builder.price;
    url = builder.url;
    items = builder.items;
  }

  public Integer getId() {
    return id;
  }
  
  public String getTitle() {
    return title;
  }
  
  public String getColor() {
    return color;
  }
  
  public Integer getPrice() {
    return price;
  }

  public String getUrl() {
    return url;
  }

  public List<Item> getItems() {
    return items;
  }
  
}
