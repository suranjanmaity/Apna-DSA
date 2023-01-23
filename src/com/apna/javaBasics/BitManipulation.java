package com.apna.javaBasics;

import java.util.Scanner;

public class BitManipulation {
    public int binToDec(int binNum) {
        int decNum = 0 ,pow = 0 ;
        while (binNum>0) {
            int lastDigit = binNum%10;
            decNum += (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum /= 10;
        }
        return decNum;
    }
    public int decToBin(int decNum) {
        int binNum = 0 ,pow = 0 ;
        while (decNum>0) {
            int lastDigit = decNum%2;
            binNum += (lastDigit * (int)Math.pow(10, pow));
            pow++;
            decNum /= 2;
        }
        return binNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BitManipulation b = new BitManipulation();
        System.out.println("enter any binary number to convert it into decimal :");
        int myNum = sc.nextInt();
        System.out.println("Decimal no for given binary no : "+myNum+" is = "+b.binToDec(myNum));
        System.out.println("enter any decimal number to convert it into binary :");
        myNum = sc.nextInt();
        System.out.println("Binary no for given decimal no : "+myNum+" is = "+b.decToBin(myNum));
    }
}
