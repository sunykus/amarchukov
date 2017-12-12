package ru.job4j.array;

public class Square {
    public int[] calculate(int bound) {

        int[] rsl = new int[bound];

        // заполнить массив через цикл элементами от 1 до bound возведенные в квадрат
        for (int index = 1; index < bound; index++) {
            rsl[index] = (int) Math.pow(index, 2);
        }
        return rsl;
    }
}
