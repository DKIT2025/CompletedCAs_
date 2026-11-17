package org.example.apps;

import org.example.utils.ArrayUtils;
import java.util.Arrays;

public class DeduplicationApp {

    public static void main(String[] args) {

        int[] grades = {80, 70, 80, 90, 70, 100, 90};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(grades));

        int[] dedup1 = ArrayUtils.deduplicate(grades);
        System.out.println("\nDeduplicate (Array Growth):");
        System.out.println(Arrays.toString(dedup1));
        System.out.println("Duplicates Removed: " + (grades.length - dedup1.length));

        int[] dedup2 = ArrayUtils.filterDuplicates(grades);
        System.out.println("\nFilter Duplicates (Blank Deletion):");
        System.out.println(Arrays.toString(dedup2));
        System.out.println("Duplicates Removed: " + (grades.length - dedup2.length));

        int[] sortedGrades = {70, 70, 80, 80, 90, 90, 100};
        int[] dedup3 = ArrayUtils.sortedDeduplicate(sortedGrades);

        System.out.println("\nSorted Deduplicate:");
        System.out.println(Arrays.toString(dedup3));

        int[] repeated = {5, 5, 5, 5};
        System.out.println("\nRepeated Values:");
        System.out.println(Arrays.toString(ArrayUtils.deduplicate(repeated)));

        int[] noDuplicates = {1, 2, 3, 4};
        System.out.println("\nNo Duplicates:");
        System.out.println(Arrays.toString(ArrayUtils.deduplicate(noDuplicates)));

        int[] singleValue = {42};
        System.out.println("\nSingle Value:");
        System.out.println(Arrays.toString(ArrayUtils.deduplicate(singleValue)));

        int[] empty = {};
        System.out.println("\nEmpty Array:");
        System.out.println(Arrays.toString(ArrayUtils.deduplicate(empty)));
    }
}