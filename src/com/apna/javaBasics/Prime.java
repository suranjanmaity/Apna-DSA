/*
 * check given number is prime or not
 * and print the prime numbers in a given range
 */
package com.apna.javaBasics;

import java.util.Scanner;

public class Prime {
    public boolean isPrime(int n) {
        if (n<=0) {
            return false;
        }
        else if (n<3) {
            return true;
        }
        else {
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i ==0) {
                    return false;
                }
            }
        }
        return true;
    }
    public void primeInRange(int n) {
        if (n<1) {
            System.out.println("none");
        }
        Prime p = new Prime();
        for (int i = 1; i <= n; i++) {
            if (p.isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Prime p = new Prime();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number to check prime or not : ");
        int n = sc.nextInt();
        if (p.isPrime(n)) {
            System.out.println(n+" is Prime");
        } else {
            System.out.println(n+" is not Prime");
        }
        System.out.println("Prime numbers that are available upto "+n+" are");
        p.primeInRange(n);
        sc.close();
    }
}
