package com.apna.array;

import java.util.Scanner;

public class Array {
    public static int linearSearch(int array[], int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static int linearSearch(Double array[], Double key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static int linearSearch(String array[], String key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(key)) {
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] array, int key) {
        int start = 0;
        int end = array.length;
        while (start<=end) {
            int mid = (start + end) / 2;
            if (array[mid] > key) {
                end  = mid - 1;
            }
            else if(array[mid] < key){
                start = mid + 1;
            }
            else if(array[mid] == key){
                return mid;
            }
        }
        return -1;
    }
    public static int getLargest(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int number : array) {
            if(number > max) {
                max = number;
            }
        }
        return max;
    }
    public static String getLargest(String[] array) {
        String max = "";
        for (String word : array) {
            if(word.length() > max.length()) {
                max = word;
            }
        }
        return max;
    }
    public static int getSmallest(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int number : array) {
            if(number < min) {
                min = number;
            }
        }
        return min;
    }
    public static String getSmallest(String[] array) {
        String min = array[0];
        for (String word : array) {
            if(word.length() < min.length()) {
                min = word;
            }
        }
        return min;
    }
    public static int[] reverseArray(int[] array) {
        for (int i = 0; i < array.length/2; i++) {
            array[i] = array[i] + array[array.length-i-1];
            array[array.length-i-1] = array[i] - array[array.length-i-1];
            array[i] = array[i] - array[array.length-i-1];
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int marks [] = {87,89,99};
        // int numbers[] = {1,3,2};
        // int [] array = new int[3];
        // array[0] =1;
        // array[1] =2;
        // array[2] =3;
        // System.out.println(array[0]+"\n"+array[1]+"\n"+array[2]);
        int moreNumbers[] = {4,5,6,7,8,9,10,11,12};
        // System.out.println(binarySearch(moreNumbers, 10));
        // String fruits[] = {"apple", "orange", "mango"};
        // System.out.println(marks[0]+"\n"+numbers[0]+"\n"+moreNumbers[0]+"\n"+fruits[0]);
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();
        // System.out.println("phy : "+marks[0]);
        // System.out.println("chem : "+marks[1]);
        // System.out.println("math : "+marks[2]);
        // int percentage = (marks[0]+marks[1]+marks[2])/3;
        // System.out.println("percentage : "+percentage+"%");
        // System.out.println("array length : "+marks.length);
        // update(marks);
        moreNumbers = reverseArray(moreNumbers);
        for (int mark : moreNumbers) {
            System.out.println(mark);
        }
        // ? what do you want to eat 
        // String [] my_menu = {"samosa", "chole bhature", "icecream", "pizza", "pasta", "pav bhaji", "fries"};
        String [] school_menu = {"lemon soda", "sprites","limca", "fries", "moong dal vada", "spring roll", "chilly potato", "dosa", "masala dosa", "gol gappe", "chowmein", "aaloo tikki", "kulfi", "ice cream", "mast ras malai", "gulab jamun", "chilli paneer", "chole bhature", "chole kulche", "naan", "mix veg", "shahi paneer", "rice", "pakoda", "pav bhaji", "salad", "water", "dal makhni"};
        for (int i = 0; i <school_menu.length; i++) {
            System.out.println(i+". "+school_menu[i]);
        }
        System.out.print("enter what you want : ");
        String order_item = sc.nextLine();
        int oreder_no = linearSearch(school_menu, order_item);
        if (oreder_no==-1) {
            System.out.println("that is not available.");
        } else {
            System.out.println("Your order number is : " + oreder_no);
        }
        System.out.println("Suggestion : "+getLargest(school_menu)+" and " + getSmallest(school_menu));
        sc.close();
    }
    // public static void incrementArray(int marks[]) {
    //     for (int i = 0; i < marks.length; i++) {
    //         marks[i]++;
    //     }
    // }
}
