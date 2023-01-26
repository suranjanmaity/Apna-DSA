/*
 * function to return
 *  average of three
 *  true if number is even else false
 *  true if number is palindrome else false
 *  sum of digits of given number
 */
package com.apna.javaBasics;

import java.util.Scanner;

public class Number {
    public int threeAverage(int a, int b, int c) {
        return (a+b+c)/3;
    }
    public boolean isEven(int num){
        return num%2==0;
    }
    public boolean isPalindrome(int num) {
        int org = num;
        int rev = 0;
        while (num>0) {
            rev = rev*10 + num%10;
            num /= 10;
        }
        return org==rev;
    }
    public int sumOfDigits(int num) {
        int sum = 0;
        while (num>0) {
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
    public static void main(String args[]) {
        Number number = new Number();
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Average of three");
        System.out.println("2. is Even");
        System.out.println("3. is palindrome");
        System.out.println("4. Sum of digits");
        System.out.println("enter your choice :");
        switch (sc.nextInt()) {
            case 1:{
                System.out.println("enter three numbers :");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                System.out.println("the average of "+a+" "+b+" "+c+" is :"+number.threeAverage(a, b, c));
                break;
            }
            case 2:{
                System.out.println("enter any number :");
                System.out.println(number.isEven(sc.nextInt()));
                break;
            }
            case 3:{
                System.out.println("enter any number :");
                System.out.println(number.isPalindrome(sc.nextInt()));
                break;
            }
            case 4:{
                System.out.println("enter any number :");
                System.out.println(number.sumOfDigits(sc.nextInt()));
                break;
            }
            default:
            System.out.println("invalid choice");
                break;
        }
        sc.close();
    }
}
