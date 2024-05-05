package org.example.methodsinjava;

public class Application {
    public void additionWithNoReturnType(int x, int y) {
        int result = x + y;
        System.out.println("AdditionResult" + result);

    }

    public Integer additionWithReturnType(int x, int y) {
        Integer result = x + y;
        return result;


    }

    public void subtractionWithNoReturnType(int x, int y) {
        int result = x - y;
        System.out.println("Subtraction Result" + result);

    }

    public Integer subtractionWithReturnType(int x, int y) {
        Integer result = x - y;
        return result;

    }

    public void multiplicationWithNoReturnType(int x, int y) {
        int result = x * y;
        System.out.println("MultiplicationResult" + result);

    }

    public Integer multiplicationWithReturnType(int x, int y) {
        Integer result = x * y;
        return result;
    }

    public void modeWithNoReturnType(int x, int y) {
        int result = x / y;
        System.out.println("ModeResult" + result);
    }

    public Integer modeWithReturnType(int x, int y) {
        Integer result = x / y;
        return result;
    }

    public static void main(String[] args) {

        Application application = new Application();
        application.additionWithNoReturnType(10, 20);
        Integer resultOfAddition = application.additionWithReturnType(22, 23);
        System.out.println(" returnResult" + resultOfAddition);
        Integer resultOfMultiplication = application.multiplicationWithReturnType(23, 33);
        System.out.println("returnResult" + resultOfMultiplication);
        application.multiplicationWithNoReturnType(12, 13);
        application.subtractionWithNoReturnType(23, 33);
        Integer resultOfSubtraction = application.subtractionWithReturnType(11, 67);
        System.out.println("returnResult" + resultOfSubtraction);
        application.modeWithNoReturnType(34, 66);
        Integer resultOfMode = application.modeWithReturnType(12, 87);
        System.out.println("returnResult" + resultOfMode);

    }

}


