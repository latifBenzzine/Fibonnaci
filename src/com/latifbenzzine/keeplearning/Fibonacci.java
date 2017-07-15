package com.latifbenzzine.keeplearning;

import java.util.Scanner;

public class Fibonacci {
  private static long calc_fib(int n) {
    if (n <= 1){
      return n;
    }else{
    	
    //return calc_fib(n - 1) + calc_fib(n - 2);
    	double f1 = Math.pow(((1 + Math.sqrt(5)) / 2.0), n);
        double f2 = Math.pow(((1 - Math.sqrt(5)) / 2.0), n);

        return (long) Math.floor((f1 - f2) / Math.sqrt(5));
    }
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
 
    System.out.println(calc_fib(n));
  }
}