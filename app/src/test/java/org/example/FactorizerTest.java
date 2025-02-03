package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class FactorizerTest {
  @Test
  void itReturnsAnEmptyListForZero() {
    Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.primeFactors(0), new ArrayList<>());
  }
  @Test
  void itReturnsAnEmptyListForOne() {
      Factorizer factorizer = new Factorizer();
      assertEquals(factorizer.primeFactors(1),new ArrayList<>());
  }
  @Test
  void itReturnsCorrectFactorsForNine() {
      Factorizer factorizer = new Factorizer();
      ArrayList<Integer> expected = new ArrayList<>();
      expected.add(3);
      expected.add(3);
      assertEquals(expected, factorizer.primeFactors(9));
  }
  @Test
  void itReturnsCorrectFactorsForTen() {
      Factorizer factorizer = new Factorizer();
      ArrayList<Integer> expected = new ArrayList<>();
      expected.add(2);
      expected.add(5);
      assertEquals(expected, factorizer.primeFactors(10));
  }
  @Test
  void itReturnsCorrectFactorsForOneHundred() {
      Factorizer factorizer = new Factorizer();
      ArrayList<Integer> expected = new ArrayList<>();
      expected.add(2);
      expected.add(2);
      expected.add(5);
      expected.add(5);
      assertEquals(expected, factorizer.primeFactors(100));
  }
  @Test
  void itReturnsCorrectFactorsForTwentyFour() {
      Factorizer factorizer = new Factorizer();
      ArrayList<Integer> expected = new ArrayList<>();
      expected.add(2);
      expected.add(2);
      expected.add(2);
      expected.add(3);
      assertEquals(expected, factorizer.primeFactors(24));
  }
  @Test
  void itReturnsAnEmptyListForNegative() {
      Factorizer factorizer = new Factorizer();
      assertEquals(new ArrayList<>(), factorizer.primeFactors(-2));
  }
  @Test
  void itReturnsCorrectFactorsForMAX() {
      Factorizer factorizer = new Factorizer();
      ArrayList<Integer> expected = new ArrayList<>();
      expected.add(2147483647);
      assertEquals(expected, factorizer.primeFactors(Integer.MAX_VALUE));
  }
}
