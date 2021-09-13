/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Maria Quiros
 */

/*Declaring package*/
package org.example;

/*Importing scanner class*/
import java.util.Scanner;

/*Specifying class*/
public class App {
    public static void main(String[] args) {

        /*Creating a scanner object*/
        Scanner scan = new Scanner(System.in);

        /*Prompting user for their name*/
        System.out.println("What is your name?");
        /*Creating a string with the user's input*/
        String yourName = scan.nextLine();

        /*Printing a greeting*/
        System.out.println("Hi, "  +yourName +", nice to meet you!");
    }
}
