package ru.job4j.array;

        import java.util.Arrays;

public class ArrayMerger {
    public int[] mergerWithSort(int[] arrayFirst, int[] arraySecond) {
        int[] newArray = new int[arrayFirst.length + arraySecond.length];
        for (int x = 0; x < arrayFirst.length; x++) {
            newArray[x] = arrayFirst[x];
        }
        for (int x = arrayFirst.length, y = 0; x < arrayFirst.length + arraySecond.length; x++, y++) {
            newArray[x] = arraySecond[y];
        }
        Arrays.sort(newArray);
        return newArray;
    }
}
