package org.example.apps;

import org.example.utils.ArrayUtils;
import java.util.Scanner;
import java.util.Arrays;

public class NumberMerging {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] nums1 = new int[5];
        int[] nums2 = new int[5];

        System.out.println("Enter 5 numbers for Array 1:");

        for (int i = 0; i < nums1.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            nums1[i] = input.nextInt();
        }

        System.out.println("\nEnter 5 numbers for Array 2:");

        for (int i = 0; i < nums2.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            nums2[i] = input.nextInt();
        }

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] merged = ArrayUtils.orderedMerge(nums1, nums2);

        System.out.println("\nMerged Sorted Array:");

        for (int i = 0; i < merged.length; i++) {
            System.out.println("Position " + i + ": " + merged[i]);
        }
    }
}