package org.example.apps;

import org.example.utils.ArrayUtils;
import java.util.Scanner;

public class NumberPartitioning {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] grades = new int[10];

        System.out.println("Enter 10 grades:");

        for (int i = 0; i < grades.length; i++) {
            System.out.print("Grade " + (i + 1) + ": ");
            grades[i] = input.nextInt();
        }

        int[] partitioned = ArrayUtils.partition(grades, 40);

        System.out.println("\nPartitioned Grades:");

        for (int i = 0; i < partitioned.length; i++) {
            System.out.println(partitioned[i]);
        }

        int passed = 0;

        for (int grade : partitioned) {
            if (grade > 40) {
                passed++;
            }
        }

        System.out.println("\nNumber Passed: " + passed);
    }
}
