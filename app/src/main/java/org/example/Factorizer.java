package org.example;

import java.util.ArrayList;

public class Factorizer {
  public ArrayList<Integer> primeFactors(Integer n) {
    ArrayList<Integer> factors = new ArrayList<>();
        
    if (n <= 1) {
        return new ArrayList<>();
    }
    while (n % 2 == 0) {
        factors.add(2);
        n /= 2;
    }
    for (int i = 3; i * i <= n; i += 2) {
        while (n % i == 0) {
            factors.add(i);
            n /= i;
        }
    }
    if (n > 1) {
        factors.add(n);
    }    return factors;
  }
}
