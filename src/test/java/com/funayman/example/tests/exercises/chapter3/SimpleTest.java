package com.funayman.example.tests.exercises.chapter3;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class SimpleTest {

  private Simple simple;

  @Before
  public void setUp() {
    simple = new Simple("Dave");
  }

  @Test
  public void constructorShouldAcceptName() {
    assertEquals("Dave", simple.getName());
  }

  @Test
  public void simpleShouldSayHello() {
    assertEquals("Hello, Dave", simple.speak());
  }
}
