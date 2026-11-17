package org.example.apps;

import org.example.utils.ArrayUtils;
import java.util.Scanner;

public class StringPartitioning {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] names = new String[10];

        System.out.println("Enter 10 names:");

        for (int i = 0; i < names.length; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = input.nextLine();
        }

        System.out.print("\nEnter a pivot name: ");
        String pivot = input.nextLine();

        String[] partitioned = ArrayUtils.partition(names, pivot);

        System.out.println("\nPartitioned Names:");

        for (String name : partitioned) {
            System.out.println(name);
        }
    }
}
