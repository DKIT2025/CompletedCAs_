package org.example.apps;

import org.example.utils.ArrayUtils;
import java.util.Arrays;
import java.util.Scanner;

public class ResizeArrayApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers would you like to store? ");
        int size = input.nextInt();

        int[] numbers = new int[size];
        int count = 0;

        while (true) {

            while (count < numbers.length) {
                System.out.print("Enter a number: ");
                numbers[count] = input.nextInt();
                count++;
            }

            System.out.print("Array is full. Add more numbers? (yes/no): ");
            String answer = input.next();

            if (!answer.equalsIgnoreCase("yes")) {
                break;
            }

            numbers = ArrayUtils.grow(numbers);
        }

        System.out.println("\nFinal Array:");
        System.out.println(Arrays.toString(numbers));
    }
}