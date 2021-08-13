package com.bridgelabz;

public class GamblingProblem {

    public static final int STAKE = 100;
    public static final int BET = 1;

    public static void isWinLoss() {
        int value = (int) (Math.random() * 10 % 2);

        if (value == 1)
            System.out.println(" WIN 1$ ");
        else
            System.out.println(" LOSE 1$ ");
    }

    public static void main(String[] args) {

        System.out.println("WELCOME TO GAMBLING SIMULATION PROGRAM");
        isWinLoss();
    }
}


