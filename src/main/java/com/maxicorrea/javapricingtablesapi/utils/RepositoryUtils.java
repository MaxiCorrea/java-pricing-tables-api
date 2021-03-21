package com.maxicorrea.javapricingtablesapi.utils;

import java.util.Map;
/**
 * 
 * @author mxcorrea
 *
 */
public final class RepositoryUtils {

  private RepositoryUtils() {
    throw new AssertionError();
  }
  
  public static final String toString(
      final Map<String,Object> source , 
      final String key) {
    return source.get(key) == null ? "" : 
           source.get(key).toString();
  }
  
  public static final Integer toInteger(
      final Map<String,Object> source , 
      final String key) {
    return source.get(key) == null ? null : 
           Integer.valueOf(source.get(key).toString());
  }
  
}
