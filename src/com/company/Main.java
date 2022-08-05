package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        double[] numbers = {1.2, -24.5, 15.15, -54.7, -9.5, 48.8, -0.12, -1.45, 125.4, 35.1, -87.5, 36.9, 12.87, 5.5, -100.99};
        double average = 0;


        if (numbers.length > 0) {
            double sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] < 0) {
                    continue;
                }
                sum += numbers[i];
            }

            System.out.println(average = sum / 8);

        }
        boolean unsorted = true;
        double temp;
        while (unsorted) {
            unsorted = false;
            System.out.println(Arrays.toString(numbers));
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    unsorted = true;
                    temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }

    }
}
