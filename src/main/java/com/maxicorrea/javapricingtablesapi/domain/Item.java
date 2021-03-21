package com.maxicorrea.javapricingtablesapi.domain;

import lombok.Builder;
import lombok.Data;

/**
 * 
 * @author mxcorrea
 *
 */
@Data
@Builder
public final class Item {
  private Integer id;
  private String text;
}