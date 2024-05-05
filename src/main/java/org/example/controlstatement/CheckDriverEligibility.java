package org.example.controlstatement;

import java.util.Scanner;

public class CheckDriverEligibility {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter a age ");
        int age = scanner.nextInt();
        if (age<18) {
            System.out.println("He Is able to Driving a Vehicle");
        }
            else{
                System.out.println("He Is Not able to Driving a Vehicle");
            }
    }
}
