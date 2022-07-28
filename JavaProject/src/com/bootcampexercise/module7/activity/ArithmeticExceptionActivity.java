package com.bootcampexercise.module7.activity;

public class ArithmeticExceptionActivity {
    public static void main(String[] args) {
    ArithmeticExceptionActivity obj = new ArithmeticExceptionActivity();
        obj.catchMe(10, 0);
}
       void catchMe(int num1, int num2) {
    try {
        int result = num1 / num2;
        System.out.println("The result is :" + result);
    }
    catch (ArithmeticException arithmeticException) {
                System.out.println("Not possible to divide with 0");
            }
    finally{
            System.out.println("Thank you for using this program");
            }

            }

}

