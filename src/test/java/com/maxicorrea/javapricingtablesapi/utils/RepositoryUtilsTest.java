package com.maxicorrea.javapricingtablesapi.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author mcorrea
 *
 */
class RepositoryUtilsTest {

  private static final Map<String, Object> SOURCE_MAP;

  static {
    SOURCE_MAP = new HashMap<>();
    SOURCE_MAP.put("0", 30);
    SOURCE_MAP.put("1", "30");
  }

  @Test
  void testToStringValueInTheMap() {
    String expected = "30";
    String actual = RepositoryUtils.toString(SOURCE_MAP, "0");
    assertEquals(expected, actual);
  }

  @Test
  void testToIntegerValueInTheMap() {
    Integer expected = 30;
    Integer actual = RepositoryUtils.toInteger(SOURCE_MAP, "1");
    assertEquals(expected, actual);
  }

}
