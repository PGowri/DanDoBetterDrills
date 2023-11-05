package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Created by dan on 6/14/17.
 */
public class StringUtilities {
    private static char[] arr;

    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
         String s = "Hello World";
            return s;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment){
        return firstSegment + secondSegment ;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment){

        return firstSegment + secondSegment;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input){
        //char[] arr = input.toCharArray();
        if (input.length() == 3) {
            return input;
        } else {
            return input.substring(0,3);
        }

    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input){
        String res = "";
        char[] arr = input.toCharArray();
        if (input.length() == 3) {
            return input;
        } else if (input.length() > 3) {
            return input.substring(input.length() - 3);
        }
        return null;
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static String compareTwoStrings(String inputValue, String comparableValue){
        if (inputValue.equals(comparableValue)){
            return inputValue + comparableValue ;
        }
        return "not equivalent";
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static char getMiddleCharacter(String inputValue) {
        char res = ' ';
        char[] charArray = inputValue.toCharArray();
        if (charArray.length % 2 == 0) {
            res = charArray[(charArray.length / 2) - 1];
        } else {
            res = charArray[(charArray.length / 2)];
        }
        return res;
    }
    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){

            String[] arr = spaceDelimitedString.split(" ");
            String firstWord = arr[0];
            return firstWord;

    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){
        String[] arr = spaceDelimitedString.split(" ");
        String secondWord = arr[1];
        return secondWord;
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){
        StringBuilder sb=new StringBuilder(stringToReverse);
        sb.reverse();
        return sb.toString();
    }

}

