package ru.job4j.array;

public class Matrix {
    public int[][] multiple(int size) {

        int[][] massive = new int[size][size];
        for (int k = 0; k < massive.length; k++) {
            for (int j = 0; j < massive.length; j++) {
                massive[k][j] = (k + 1) * (j + 1);
            }
        }
        return massive;
    }
}
