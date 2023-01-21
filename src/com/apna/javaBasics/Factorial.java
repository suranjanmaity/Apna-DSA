/*
 * to find factorial of any given number
 */
package com.apna.javaBasics;

import java.util.Scanner;

public class Factorial {
    public int factorial(int n) {
        int factorial = 1;
        for (int i = n; i > 1; i--) {
            factorial = factorial*i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Factorial f = new Factorial();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number to find its factorial :");
        int n = scanner.nextInt();
        System.out.println("factorial : "+f.factorial(n));
        scanner.close();
    }
}
