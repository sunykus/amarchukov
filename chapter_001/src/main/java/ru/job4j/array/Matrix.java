package ru.job4j.array;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {


        int[][] multiple = new int[9][9];
            int size = 9;
            for (int k = 1; k < size; k++) {
                for (int j = 1; j < k; j++) {
                    multiple[k][j] = k * j;

                }
            }
            System.out.println(Arrays.deepToString(multiple));

        }
    }
