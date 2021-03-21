package com.maxicorrea.javapricingtablesapi.domain;
/**
 * 
 * @author mxcorrea
 *
 */
public final class Item {
  
  public static final Item createOf(
      final Integer id,
      final String text) {
    return new Item(id, text);
  }
  
  private final Integer id;
  private final String text;
  
  private Item(
      final Integer id,
      final String text) {
    this.id = id;
    this.text = text;
  }
  
  public Integer getId() {
    return id;
  }
  
  public String getText() {
    return text;
  }
  
}
