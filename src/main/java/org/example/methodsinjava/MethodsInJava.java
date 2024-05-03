package org.example.methodsinjava;

public class MethodsInJava {

    // What is method  in java
    /*
    Method is small amount of the code which performs specific task.
    Methods in java we can create same like variable.
    Method has return type arguments and its properties.
    EX: public void myStudentDetails(){} this a method.
    Let's crate a method
      * */

    public void myStudentDetails() {
        System.out.println("This is a method with no arguments/ parameters");
    }

    public void myStudentDetails(int data) {
        System.out.println("This is a method with int data  arguments /parameters" + data);
    }

    public String myStudentDetailsString() {
        System.out.println("This is a method with no arguments but it has return type");

        return "this is string.";
    }

    public void myStudentDetails(int x, int y) {
        int result = x + y;
        System.out.println("This is a method with x , y 2 arguments" + result);
    }

    public void myStudentDetailsLoop() {
        System.out.println("This is a method with  arguments but loop is inside");
        for (int i = 10; i < 100; i++) {
            System.out.println(i);
        }

    }

    public Integer myStudentDetails(int x, int y, int p) {
        int result = x + y + p;
        System.out.println("This is a method with 2 arguments" + result);
        return result;
    }


    public static void main(String[] args) {
        // Creating the object
        MethodsInJava methodsInJava = new MethodsInJava();
        // calling the myStudentDetails method.
        methodsInJava.myStudentDetails();
        methodsInJava.myStudentDetails(10);
        String returnedResult = methodsInJava.myStudentDetailsString();
        System.out.println("returnedResult" + returnedResult);
        methodsInJava.myStudentDetails(10,20);
        methodsInJava.myStudentDetailsLoop();
        Integer returnedResultInteger= methodsInJava.myStudentDetails(10,20,30);



    }
}
