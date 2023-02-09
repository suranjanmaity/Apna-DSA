package com.apna.patterns;

import java.util.Scanner;

public class Triangle {
    /*
                +
              + +
            + + +
          + + + +
        + + + + +
    */
    public void invertedRotateadHalfPyramid(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col+row>n) {
                    System.out.print("+ ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    /*
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1
     */
    public void invertedRotateadHalfPyramidNumber(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    /*
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
     */
    public void floydTriangle(int n) {
        int num = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    /*
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1
     */
    public void triangle01(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                if ((row+col)%2==0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    /*
        +                 +
        + +             + +
        + + +         + + +
        + + + +     + + + +
        + + + + + + + + + +
        + + + + + + + + + +
        + + + +     + + + +
        + + +         + + +
        + +             + +
        +                 +
     */
    public void butterfly(int n) {
        // first half
        for (int i = 1; i <= n; i++) {
            // stars = i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // spaces = 2* (n-i)
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print("  ");
            }
            // stars = i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // second half
        for (int i = n; i >= 1; i--) {
            // stars = i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // spaces = 2* (n-i)
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print("  ");
            }
            // stars = i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // todo
    public void numberPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j >=1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public void palindromicNumberPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j >=1; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >=1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length : ");
        int l = sc.nextInt();
        Triangle p = new Triangle();
        p.invertedRotateadHalfPyramid(l);
        p.invertedRotateadHalfPyramidNumber(l);
        p.floydTriangle(l);
        p.triangle01(l);
        p.butterfly(l);
        p.numberPyramid(l);
        p.palindromicNumberPyramid(l);
        sc.close();
    }
}