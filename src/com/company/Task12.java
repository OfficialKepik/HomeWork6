package com.company;

public class Task12 {
    public static void main(String[] args) {
        int size = 5;
        int[] arr = new int[size];
        arr[0] = 1;
        arr[1] = 5;
        arr[2] = 3;
        arr[3] = 5;
        arr[4] = 1;
        int countY = 0;
        for (int i = 0; i < size / 2; i++) {
            if (arr[i] == arr[size - 1 - i]) {
                countY++;
            }
        }
        if (countY == size / 2)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
