package com.funayman.example.tests.exercises.chapter3;

import java.util.Map;
import java.util.HashMap;

import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class HashMapTest {

  private Map<Object, Object> map;

  @Before
  public void init() {
    map = new HashMap<Object, Object>();
  }

  public Object[] getKeyValues() {
    return new Object[][] {
      { "dave", "rocks" },
      { "ints", 10 },
      { 10, 2.3 },
      { null, "null is key" }
    };
  }

  @Test
  @Parameters(method = "getKeyValues")
  public void putAndGetTest(Object key, Object value) {
    map.put(key, value);

    assertEquals(value, map.get(key));
  }

  @Test
  public void overWritePutValue() {
    map.put("dave", "sucks");
    assertEquals("sucks", map.get("dave"));

    map.put("dave", "rocks!");
    assertEquals("rocks!", map.get("dave"));
  }

  @Test
  public void clearMapTest() {
    map.put("key", 10);
    map.clear();

    assertNull(map.get("key"));
    assertEquals(0, map.size());
  }

  @Test (expected = IllegalArgumentException.class)
  public void negativeInitialCapacityTest() {
    new HashMap<Object, Object>(-1);
  }

}
