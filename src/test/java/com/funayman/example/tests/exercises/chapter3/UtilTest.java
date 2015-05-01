package com.funayman.example.tests.exercises.chapter3;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class UtilTest {

  public Object[] getStrings() {
    return new String[][] {
      { "skcoR evaD", "Dave Rocks" },
      { "社会", "会社" },
      { "", "" },
      { null, null }
    };
  }

  @Test
  @Parameters(method = "getStrings")
  public void reverseStringTests(String expected, String toReverse) {
    assertEquals(expected, Util.reverse(toReverse));
  }

}
