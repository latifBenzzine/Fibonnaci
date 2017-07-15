package com.latifbenzzine.keeplearning;
import java.math.BigDecimal;
import java.util.Scanner;

public class FibonacciLastDigit {
    private static long getFibonacciLastDigitNaive(int n) {
        if (n <= 1)
            return ((n));

        double f1 = (Math.pow(((1 + Math.sqrt(5)) / 2.0), n));
        double f2 = (Math.pow(((1 - Math.sqrt(5)) / 2.0), n));

        BigDecimal result = new BigDecimal(Math.floor((f1 - f2) / Math.sqrt(5)));
        return (result.remainder(new BigDecimal(10)).longValueExact()) ;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
        scanner.close();
    }
    
}
