package com.apna.patterns;

import java.util.Scanner;

public class Quadilateral {
    /*
        + + + + + +
        +         +
        +         +
        +         +
        + + + + + +
     */
    public void hollowRectangle(int l, int w) {
        for (int row = 0; row < l; row++) {
            for (int col = 0; col < w; col++) {
                if (row == 0 || row == l-1 || col ==0 || col == w-1) {
                    System.out.print("+ ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    /*
            + + + + +
           + + + + +
          + + + + +
         + + + + +
        + + + + +
     */
    public void solidRhombus(int n) {
        for (int row = 1; row <= n; row++) {
            // space =  n-i
            for (int col = 1; col <= n-row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= n; col++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
    }
    /*
            + + + + +
           +       +
          +       +
         +       +
        + + + + +
     */
    public void hollowRhombus(int n) {
        for (int row = 1; row <= n; row++) {
            // space =  n-i
            for (int col = 1; col <= n-row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || col ==1 || col == n) {
                    System.out.print("+ ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    /*
                +
              + + +
            + + + + +
          + + + + + + +
        + + + + + + + + +
        + + + + + + + + + 
          + + + + + + +
            + + + + +
              + + +
                +
     */
    public void diamond(int n) {
        // for first half
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            // star
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
        // for second half
        for (int i = n; i >= 1; i--) {
            // space
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            // star
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length : ");
        int l = sc.nextInt();
        System.out.println("enter width : ");
        int w = sc.nextInt();
        Quadilateral r = new Quadilateral();
        r.hollowRectangle(l, w);
        r.solidRhombus(l);
        r.hollowRhombus(l);
        r.diamond(l);
        sc.close();
    }
}
