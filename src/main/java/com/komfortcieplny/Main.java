package com.komfortcieplny;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String inputSign = "";
        String previousSign = "";
        int inputCount = 0;
        List<Sign> signsList = new ArrayList<>();

        System.out.println("Program checks how many of the same characters are given next to each other in the text.");
        System.out.println("The result will be printed in format [sign1][number1][sign2][number2]...");
        System.out.println("Insert text to check:");


        String inputText = scan.nextLine();

        for(int i=0; i<inputText.length(); i++) {
            inputSign = inputText.substring(i, i+1);
            //System.out.println(inputSign);
            if(!inputSign.equals(previousSign) && i>0) {
                Sign sign = new Sign(previousSign, inputCount);
                signsList.add(sign);

                inputCount = 0;
            }
            inputCount++;
            if (i==inputText.length()-1) {
                Sign sign = new Sign(inputSign, inputCount);
                signsList.add(sign);
            }
            previousSign = inputSign;
        }

        for(Sign sign : signsList) {
            System.out.print(sign.getSign()+sign.getCounter());
        }
        System.out.println();
    }
}