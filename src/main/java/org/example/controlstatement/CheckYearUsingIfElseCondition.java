package org.example.controlstatement;

import java.util.Scanner;

public class CheckYearUsingIfElseCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A Year:");

        int year = scanner.nextInt();

        if (year == 2024) {
            System.out.println(year
            );
        } else {
            System.out.println("Not 2024");


        }
    }
}
