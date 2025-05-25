package com.mycompany.studyjavaincodegym.Chuong8.th1;
public class Calculator {
    public static int calculate(int fistOperand, int secondOperrand, char operator) {
        switch (operator) {
            case '+':
                return fistOperand + secondOperrand;
            case '-':
                return fistOperand - secondOperrand;
            case '*':
                return fistOperand * secondOperrand;
            case '/':
                if (secondOperrand != 0)
                    return fistOperand / secondOperrand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
