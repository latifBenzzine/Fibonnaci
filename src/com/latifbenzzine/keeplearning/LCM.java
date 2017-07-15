package com.latifbenzzine.keeplearning;

import java.util.*;

public class LCM {
  private static long lcm_naive(int a, int b) {
    
    return (long) a * b / gcd(a,b);
    
  }
  
  private static long gcd(long a, long b) {
	   a = Math.abs(a);
	   b = Math.abs(b);
	   return(b == 0) ? a: gcd(b,a%b);
	  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(lcm_naive(a, b));
    scanner.close();
  }
}
