package com.latifbenzzine.keeplearning;
import java.util.Scanner;

public class GCD {
  private static long gcd(long a, long b) {
   a = Math.abs(a);
   b = Math.abs(b);
   return(b == 0) ? a: gcd(b,a%b);
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    long a = scanner.nextInt();
    long b = scanner.nextInt();

    System.out.println(gcd(a, b));
    scanner.close();
  }
}

