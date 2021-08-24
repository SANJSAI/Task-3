package com.javatutorial;

import java.util.Scanner;

class task1 {

    public static void main(String[] args) {

        int grade;
        System.out.println("Enter your mark :");
       Scanner mark = new Scanner(System.in);
        grade = mark.nextInt();
        if (grade >= 80 )
            System.out.println("You were passed and Your grade is Excellent.");
        else if (grade >= 60 )
            System.out.println("You were passed and Your grade is Super.");
        else if (grade >= 40 )
            System.out.println("You were passed and Your grade is Nice,get more marks.");
        else if (grade < 40)
            System.out.println("You were failed and Your grade is Need to improve.");
        else
            System.out.println("Invalid input.");

        }
    }
