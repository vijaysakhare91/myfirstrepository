package org.example.controlstatement;

public class IfStatement {
    public static void main(String[] args) {

        //if statement execute only when the block of statement is true in the if condition.
        int x = 10;
        int y = 20;
        if (x + y == 30) {
            System.out.println("if Block is True ,executed");
        }
        if (true){
            System.out.println(true);
        }
        if (false) {
            System.out.println("in false statement code will be not executed");
        }


    }


}
