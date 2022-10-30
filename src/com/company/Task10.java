package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int index = 0;

        System.out.print(" Enter a size : ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(33) + 1;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] % arr[i - 1] == 0) {
                if (arr[i] % arr[i + 1] == 0) {
                    index = i;
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

        if (index != 0) {
            System.out.println(index);
        } else {
            System.out.println("-1");
        }
    }
}
