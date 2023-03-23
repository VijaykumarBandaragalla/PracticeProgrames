package com.girmiti.poc;

public class RemoveDuplicatesExample {
    
    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        if (n == 0 || n == 1) {
            return arr;
        }
        int j = 0; 
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j] = arr[i];
                j++;
            }
        }
        arr[j] = arr[n - 1]; 
        int[] result = new int[j + 1];
        for (int i = 0; i <= j; i++) {
            result[i] = arr[i];
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5};
        int[] uniqueArr = removeDuplicates(arr);
        System.out.print("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Array with duplicates removed: ");
        for (int i = 0; i < uniqueArr.length; i++) {
            System.out.print(uniqueArr[i] + " ");
        }
    }
}
