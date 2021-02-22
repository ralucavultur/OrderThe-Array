package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] values = getIntegers(5);
        printArray(values);
        System.out.println("-------");
        printArray(sortIntegers(values));


    }

    public static int[] getIntegers(int number) {
        int[] values = new int[number];
        System.out.println("Enter " + number + "numbers: \r");
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " has value:" + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        boolean isSwap = true;

        int aux;
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }

        while (isSwap) {
            isSwap = false;
            for (int i = 0; i < sortedArray.length-1; i++) {
                if (sortedArray[i+1] > sortedArray[i]) {
                    aux = sortedArray[i+1];
                    sortedArray[i+1] = sortedArray[i];
                    sortedArray[i] = aux;
                    isSwap = true;
                }
            }
        }

        return sortedArray;
    }
}
