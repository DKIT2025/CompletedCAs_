package org.example.utils;

public class ArrayUtils {

    /**
     * Removes duplicate values from an integer array.
     *
     * @param arr the input array
     * @return a new array containing each value once
     */
    public static int[] deduplicate(int[] arr) {

        int[] result = new int[0];

        for (int value : arr) {

            boolean found = false;

            for (int item : result) {
                if (item == value) {
                    found = true;
                    break;
                }
            }

            if (!found) {

                int[] temp = new int[result.length + 1];

                for (int i = 0; i < result.length; i++) {
                    temp[i] = result[i];
                }

                temp[result.length] = value;
                result = temp;
            }
        }

        return result;
    }

    /**
     * Removes duplicate grades using -1 as a temporary blank marker.
     *
     * @param grades array of grades
     * @return array containing unique grades only
     */
    public static int[] filterDuplicates(int[] grades) {

        if (grades.length == 0) {
            return new int[0];
        }

        int[] temp = new int[grades.length];

        for (int i = 0; i < grades.length; i++) {
            temp[i] = grades[i];
        }

        for (int i = 0; i < temp.length; i++) {

            if (temp[i] == -1) {
                continue;
            }

            for (int j = i + 1; j < temp.length; j++) {
                if (temp[i] == temp[j]) {
                    temp[j] = -1;
                }
            }
        }

        int count = 0;

        for (int value : temp) {
            if (value != -1) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int value : temp) {
            if (value != -1) {
                result[index] = value;
                index++;
            }
        }

        return result;
    }

    /**
     * Removes duplicates from a sorted array.
     * The input array must already be sorted in ascending order.
     *
     * @param arr the sorted input array
     * @return a new array containing each distinct value once
     */
    public static int[] sortedDeduplicate(int[] arr) {

        if (arr.length == 0) {
            return new int[0];
        }

        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                count++;
            }
        }

        int[] result = new int[count];

        result[0] = arr[0];
        int index = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                result[index] = arr[i];
                index++;
            }
        }

        return result;
    }
    /**
     * Creates a new array that is 10 elements larger than the original.
     *
     * @param nums the original array
     * @return a new array containing the original values with 10 extra spaces
     */
    public static int[] grow(int[] nums) {

        int[] bigger = new int[nums.length + 10];

        for (int i = 0; i < nums.length; i++) {
            bigger[i] = nums[i];
        }

        return bigger;
    }
    /**
     * Resizes a String array to the specified size.
     *
     * @param text the original String array
     * @param newSize the required size
     * @return the resized array
     */
    public static String[] resize(String[] text, int newSize) {

        String[] resized = new String[newSize];

        int limit;

        if (newSize < text.length) {
            limit = newSize;
        } else {
            limit = text.length;
        }

        for (int i = 0; i < limit; i++) {
            resized[i] = text[i];
        }

        return resized;
    }
    /**
     * Merges two integer arrays into one array.
     *
     * @param nums1 first array
     * @param nums2 second array
     * @return merged array
     */
    /**
     * Merges two integer arrays into one array.
     *
     * @param nums1 first array
     * @param nums2 second array
     * @return merged array
     */
    public static int[] merge(int[] nums1, int[] nums2) {

        int[] merged = new int[nums1.length + nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            merged[i] = nums1[i];
        }

        for (int i = 0; i < nums2.length; i++) {
            merged[nums1.length + i] = nums2[i];
        }

        return merged;
    }

    /**
     * Merges two String arrays into one array.
     *
     * @param text1 first array
     * @param text2 second array
     * @return merged array
     */
    public static String[] merge(String[] text1, String[] text2) {

        String[] merged = new String[text1.length + text2.length];

        for (int i = 0; i < text1.length; i++) {
            merged[i] = text1[i];
        }

        for (int i = 0; i < text2.length; i++) {
            merged[text1.length + i] = text2[i];
        }

        return merged;
    }
    public static int[] orderedMerge(int[] nums1, int[] nums2) {

        int[] merged = new int[nums1.length + nums2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] <= nums2[j]) {
                merged[k] = nums1[i];
                i++;
            } else {
                merged[k] = nums2[j];
                j++;
            }

            k++;
        }

        while (i < nums1.length) {
            merged[k] = nums1[i];
            i++;
            k++;
        }

        while (j < nums2.length) {
            merged[k] = nums2[j];
            j++;
            k++;
        }

        return merged;
    }
    /**
     * Merges two sorted String arrays into one sorted array.
     *
     * @param text1 first sorted String array
     * @param text2 second sorted String array
     * @return merged sorted String array
     */
    public static String[] orderedMerge(String[] text1, String[] text2) {

        String[] merged = new String[text1.length + text2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < text1.length && j < text2.length) {

            if (text1[i].compareToIgnoreCase(text2[j]) <= 0) {
                merged[k] = text1[i];
                i++;
            } else {
                merged[k] = text2[j];
                j++;
            }

            k++;
        }

        while (i < text1.length) {
            merged[k] = text1[i];
            i++;
            k++;
        }

        while (j < text2.length) {
            merged[k] = text2[j];
            j++;
            k++;
        }

        return merged;
    }
    public static int[] partition(int[] nums, int pivot) {

        int[] higher = new int[0];
        int[] lower = new int[0];

        for (int num : nums) {

            if (num > pivot) {

                int[] temp = new int[higher.length + 1];

                for (int i = 0; i < higher.length; i++) {
                    temp[i] = higher[i];
                }

                temp[higher.length] = num;
                higher = temp;

            } else {

                int[] temp = new int[lower.length + 1];

                for (int i = 0; i < lower.length; i++) {
                    temp[i] = lower[i];
                }

                temp[lower.length] = num;
                lower = temp;
            }
        }

        return merge(higher, lower);
    }
    public static String[] partition(String[] text, String pivot) {

        String[] lower = new String[0];
        String[] higher = new String[0];

        for (String word : text) {

            if (word.compareToIgnoreCase(pivot) <= 0) {

                String[] temp = new String[lower.length + 1];

                for (int i = 0; i < lower.length; i++) {
                    temp[i] = lower[i];
                }

                temp[lower.length] = word;
                lower = temp;

            } else {

                String[] temp = new String[higher.length + 1];

                for (int i = 0; i < higher.length; i++) {
                    temp[i] = higher[i];
                }

                temp[higher.length] = word;
                higher = temp;
            }
        }

        return merge(lower, higher);
    }
}