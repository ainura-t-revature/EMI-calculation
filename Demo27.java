package com.company.Class6;

import java.util.Scanner;

//Enter First Number :
//        Enter Second Number//        Select Option:
//        1 - Add
//        2 - Subtract
//        3 - Multiple
//        4 - Divide
//
//        Result: _______


public class Demo27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Select option: ");
        int option = sc.nextInt();
        switch (option){
            case 1: result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
            break;
            case 2: result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
            break;
            case 3: result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
            break;
            case 4: result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
            break;
            default:
                System.out.println("You can choose an option between one and four");
        }

    }
}
