package ru.job4j.array;


public class ArrayMerger {
    public int[] mergerWithSort(int[] arrayFirst, int[] arraySecond) {
        int[] newArray = new int[arrayFirst.length + arraySecond.length];
        for (int x = 0; x < arrayFirst.length; x++) {
            newArray[x] = arrayFirst[x];
        }
        for (int x = arrayFirst.length, y = 0; x < arrayFirst.length + arraySecond.length; x++, y++) {
            newArray[x] = arraySecond[y];
        }
        for (int i = newArray.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (newArray[j] > newArray[j + 1]) {
                    int tmp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = tmp;
                }
            }
        }
        return newArray;
    }
}
