package com.Hackerank;

import java.util.HashMap;
import java.util.HashSet;

public class DuplicateCharacter {

    public static void main(String[] args) {

        String str = "JAVA";
        char ch[] = str.toCharArray();
        System.out.println(duplicateChar(ch));

    }

    public static char duplicateChar(char str[]) {

        HashSet<Character> h = new HashSet<>();

        // Traverse the input array from left to right
        for (int i = 0; i <= str.length - 1; i++) {
            char c = str[i];

            // If element is already in hash set, update x
            // and then break
            if (h.contains(c))
                return c;

            else // Else add element to hash set
                h.add(c);
        }

        return '\0';

    }
}
