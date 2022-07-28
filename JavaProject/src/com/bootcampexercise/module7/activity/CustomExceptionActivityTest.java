package com.bootcampexercise.module7.activity;

public class CustomExceptionActivityTest {
    public static void main(String[] args) throws CustomExceptionActivity {
        CustomExceptionActivityTest user = new CustomExceptionActivityTest();
        user.validateUser("John");
        user.validateUser("Mike");
        user.validateUser("Shanti");
        user.validateUser("Liene");
    }

    void validateUser(String name) throws CustomExceptionActivity {
        String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};
//flag stores 1 if a match is found else it should remain 0
        int flag = 0;
        for (int i = 0; i < 4; i++) {
            if (validUsers[i] == name) {
                flag = 1;
            }
        }
// to check if flag is one, print a message "Welcome to Payroll program"
        //else if(flag==1){
        System.out.println("Welcome to Payroll program");
    }
}
