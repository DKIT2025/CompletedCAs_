package org.example.apps;

import org.example.utils.ArrayUtils;
import java.util.Arrays;
import java.util.Scanner;

public class StringArrayApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] words = new String[2];
        int count = 0;

        while (true) {

            System.out.print("Do you want to enter a word? (yes/no): ");
            String answer = input.nextLine();

            if (!answer.equalsIgnoreCase("yes")) {
                break;
            }

            if (count == words.length) {
                words = ArrayUtils.resize(words, words.length + 5);
            }

            System.out.print("Enter word: ");
            words[count] = input.nextLine();
            count++;
        }

        System.out.println("\nWords Entered:");
        System.out.println(Arrays.toString(words));

        System.out.print("\nHow many words would you like to keep? ");
        int keep = Integer.parseInt(input.nextLine());

        String[] smaller = ArrayUtils.resize(words, keep);

        System.out.println("\nNew Array:");
        System.out.println(Arrays.toString(smaller));
    }
}