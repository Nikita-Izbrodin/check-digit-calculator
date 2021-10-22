package com.company;

import java.util.*; // imports

public class Main {

    // 13-digit barcode check

    public static void main(String[] args) {
	// write your code here

        Scanner input = new Scanner(System.in); // allows to get input from user

        System.out.println("Please enter a 12-digit barcode: ");
        int barcode = input.nextInt(); // gets integer variable barcode from user

        int oddSum = 0;
        int evenSum = 0;

        //int[] arrayInt = { 9, 3, 1, 1, 9, 6, 0, 0, 4 , 3, 7, 1};
        int[] arrayInt = new int[12];

        for (int i =0; i < arrayInt.length; i++) {
            arrayInt[i] = input.nextInt();
        }

        // step 2
        for (int i = 0; i < arrayInt.length; ++i) {
            if (i % 2 != 0) {
                //System.out.println(arrayInt[i]  + " " + i);
                oddSum = oddSum + arrayInt[i];
            }
        }
        System.out.println("Sum of odd numbers: " + oddSum);

        // step 4
        for (int i = 0; i < arrayInt.length; ++i) {
            if (i % 2 == 0) {
                //System.out.println(arrayInt[i]  + " " + i);
                evenSum = evenSum + arrayInt[i];
            }
        }
        System.out.println("Sum of even numbers: " + evenSum);

        int totalEvenOdd = (oddSum*3)+evenSum;
        System.out.println("Total of even and odd: " + totalEvenOdd);

        int checkDigit = 80 - totalEvenOdd;

        if (checkDigit == 8) {
            System.out.println("The barcode is: " + Arrays.toString(arrayInt) + " " + checkDigit);
        } else {
            System.out.println("The check digit is incorrect.");
        }

    }
}
