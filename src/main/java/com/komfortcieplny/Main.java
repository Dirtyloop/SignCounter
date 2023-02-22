package com.komfortcieplny;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Program checks how many of the same characters are given next to each other in the text.");
        System.out.println("The result will be printed in format [sign1][number1][sign2][number2]...");
        System.out.println("Insert text to check:");

        String inputText = scan.nextLine();

        System.out.println(SignListService.checkInputText(inputText));


    }

}