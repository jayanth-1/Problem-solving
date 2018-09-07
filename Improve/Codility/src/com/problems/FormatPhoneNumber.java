package com.problems;

public class FormatPhoneNumber {

    public String solution(String s) {
        int count = 0;

        //removing characters other than digits
        String partialFormatted = s.replaceAll("[^\\d]", "");
        int lenOfFormatted = partialFormatted.length();
        int remainder = lenOfFormatted % 3;
        StringBuffer finalFormatted = new StringBuffer();

        //inserting '-' after every three digits
        for (int i = 0; i < lenOfFormatted; i++) {
            if (count == 3) {
                finalFormatted.append("-");
                count = 0;
            }

            finalFormatted.append(partialFormatted.charAt(i));
            count++;
        }

        StringBuffer finalFormattedString = new StringBuffer(finalFormatted);

        //swapping '-' and last but one character if remainder is 1
        if (remainder == 1) {
            finalFormattedString.setCharAt(finalFormatted.length() - 2, finalFormatted.charAt(finalFormatted.length() - 3));
            finalFormattedString.setCharAt(finalFormatted.length() - 3, finalFormatted.charAt(finalFormatted.length() - 2));
        }

        //converting string buffer to string
        return finalFormattedString.toString();

    }

    public static void main(String[] args) {

        //creating FormatPhoneNumber object
        FormatPhoneNumber formatPhoneNumberObj = new FormatPhoneNumber();
        String s = "00-44 48 5555 8361";
        System.out.println(formatPhoneNumberObj.solution(s));
    }

}
