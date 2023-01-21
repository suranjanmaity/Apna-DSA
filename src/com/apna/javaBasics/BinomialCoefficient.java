/*
 * to find binomial coefficient nCr
 * for given n and r
 */
package com.apna.javaBasics;

import java.util.Scanner;

public class BinomialCoefficient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter value of n : ");
        int n = scanner.nextInt();
        System.out.print("enter value of r : ");
        int r = scanner.nextInt();
        if (r>n)
        {
            System.out.println("value of r cannot be greater than value of n");
        }
        else
        {
            System.out.println("binomial coefficient : "+binomialCoefficient(n,r));
        }
        scanner.close();
    }
    public static int binomialCoefficient(int n, int r) {
        Factorial f = new Factorial();
        return f.factorial(n)/(f.factorial(r)*f.factorial(n-r));
    }
}
