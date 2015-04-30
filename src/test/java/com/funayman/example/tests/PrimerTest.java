package com.funayman.example.tests;

import org.junit.Test;
import static org.junit.Assert.*;

public class PrimerTest {

  @Test
  public void testIfPrime() {
    assertTrue(Primer.isPrime(2));
    assertTrue(Primer.isPrime(5));
    assertFalse(Primer.isPrime(4));
  }
}
