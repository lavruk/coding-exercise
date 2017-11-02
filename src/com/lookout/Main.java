package com.lookout;

/**
 * The beauty of the string
 */
public class Main {

    public static void main(String[] args) {
        // Given a string 'input', the beauty of the string is the sum of the beauty of the letters in it.
        // The beauty of each letter is defined in the 'pattern' string.
        // Write a method or function to compute the beauty of a string, preferably in object object-oriented or functional way.

        String input = "ABbCcc";
        String pattern = "A1B2C3";
        int beauty = 0; //compute beauty here
        System.out.println(String.format("The beauty of the %s is %d", input, beauty));
    }

}
