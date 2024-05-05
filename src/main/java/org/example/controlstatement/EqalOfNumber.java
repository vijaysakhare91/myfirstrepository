package org.example.controlstatement;

import java.util.Scanner;

public class EqalOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = scanner.nextInt();
        if (number == 10) {
            System.out.println("Entered Number is " + number);
        } else {
            System.out.println("Entered number is other than 10");
        }


    }
}
