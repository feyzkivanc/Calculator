package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("please enter first number");
        int n1= scan.nextInt();
        System.out.print("please enter second number");
        int n2= scan.nextInt();
        System.out.print("Please select a process: 1:+, 2:-, 3:*, 4:/");
        int select= scan.nextInt();
        switch (select){
            case 1:
                System.out.println("first number+second number:" + (n1+n2));
                break;
            case 2:
                System.out.println("first number-second number:" + (n1-n2));
                break;
            case 3:
                System.out.println("first number*second number:" + (n1*n2));
                break;
            case 4:
                System.out.println("first number/second number:" + (n1/n2));
                break;
            default:
                System.out.println("Please enter a valid process");
            }
        }
    }

