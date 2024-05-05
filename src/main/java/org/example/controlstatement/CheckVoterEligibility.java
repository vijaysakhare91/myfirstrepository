package org.example.controlstatement;

import java.util.Scanner;

public class CheckVoterEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a age ");

        int age = scanner.nextInt();

        if (age >18) {
            System.out.println("He is able to voting");
        } else {
            System.out.println("He is Not able to voting");


        }
    }

}
