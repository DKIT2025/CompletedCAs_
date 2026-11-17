package org.example.apps;

import org.example.utils.ArrayUtils;
import java.util.Scanner;
import java.util.Arrays;

public class StringMerging {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] text1 = new String[5];
        String[] text2 = new String[5];

        System.out.println("Enter 5 words for Array 1:");

        for (int i = 0; i < text1.length; i++) {
            System.out.print("Word " + (i + 1) + ": ");
            text1[i] = input.nextLine();
        }

        System.out.println("\nEnter 5 words for Array 2:");

        for (int i = 0; i < text2.length; i++) {
            System.out.print("Word " + (i + 1) + ": ");
            text2[i] = input.nextLine();
        }

        Arrays.sort(text1, String.CASE_INSENSITIVE_ORDER);
        Arrays.sort(text2, String.CASE_INSENSITIVE_ORDER);

        String[] merged = ArrayUtils.orderedMerge(text1, text2);

        System.out.println("\nMerged Array:");

        for (int i = 0; i < merged.length; i++) {
            System.out.println("Position " + i + ": " + merged[i]);
        }
    }
}
