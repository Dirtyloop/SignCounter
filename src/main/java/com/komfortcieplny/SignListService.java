package com.komfortcieplny;

import java.util.ArrayList;
import java.util.List;

public class SignListService {

    public static List<Sign> checkInputText(String inputText) {
        String inputSign = "";
        String previousSign = "";
        int inputCount = 0;
        List<Sign> list = new ArrayList<>();

        for(int i=0; i<inputText.length(); i++) {
            inputSign = inputText.substring(i, i+1);
            //System.out.println(inputSign);
            if(!inputSign.equals(previousSign) && i>0) {
                Sign sign = new Sign(previousSign, inputCount);
                list.add(sign);

                inputCount = 0;
            }
            inputCount++;
            if (i==inputText.length()-1) {
                Sign sign = new Sign(inputSign, inputCount);
                list.add(sign);
            }
            previousSign = inputSign;
        }

        return list;
    }
    public static void printResult(List<Sign> list) {
        for(Sign sign : list) {
            System.out.print(sign.getSign()+sign.getCounter());
        }
        System.out.println();
    }
}
