package com.apna.array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int marks [] = {87,89,99};
        int numbers[] = {1,3,2};
        int moreNumbers[] = {4,5,6,7,8,9,10,11,12};
        String fruits[] = {"apple", "orange", "mango"};
        System.out.println(marks[0]+"\n"+numbers[0]+"\n"+moreNumbers[0]+"\n"+fruits[0]);
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("phy : "+marks[0]);
        System.out.println("chem : "+marks[1]);
        System.out.println("math : "+marks[2]);
        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage : "+percentage+"%");
        System.out.println("array length : "+marks.length);
        update(marks);
        for (int mark : marks) {
            System.out.println(mark);
        }
        sc.close();
    }
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i]++;
        }
    }
}
