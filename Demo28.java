package com.company.Class6;

import java.util.Scanner;

public class Demo28 {
    public static void main(String[] args) {

//        EMI = P × r × (1 + r)^n/((1 + r)^n - 1) where
//        P= Loan amount, r= interest rate, n=tenure in number of months
        Scanner sc = new Scanner(System.in);
        int EMI = 0;
        System.out.println("Loan amount: ");
        int loanAmount = sc.nextInt();
        System.out.println("Rate of Interest: ");
        int interest = sc.nextInt();
        System.out.println("Tenure: ");
        int tenure = sc.nextInt();
        EMI = loanAmount * interest * (1 + interest)^tenure/((1 + interest)^tenure - 1);
        System.out.println("EMI: " + EMI);

    }
}
