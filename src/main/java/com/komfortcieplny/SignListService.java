package com.komfortcieplny;

import java.util.ArrayList;
import java.util.List;

public class SignListService {

    public static String checkInputText(String inputText) {
        String inputSign;
        String previousSign = "";
        String warningEmptyString = "Inputed text was empty!";
        int inputCount = 0;
        List<Sign> list = new ArrayList<>();

        if(inputText.isEmpty()) {
            return warningEmptyString;
        }

        for(int i=0; i<inputText.length(); i++) {
            inputSign = inputText.substring(i, i+1);

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

        return convertResultToString(list);
    }
    private static String convertResultToString(List<Sign> list) {
        StringBuilder stringBuilder = new StringBuilder();

        for(Sign sign : list) {
            stringBuilder.append(sign.getSign());
            stringBuilder.append(sign.getCounter());
        }

        return stringBuilder.toString();
    }
}
