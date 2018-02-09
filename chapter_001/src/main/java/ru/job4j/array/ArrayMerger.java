package ru.job4j.array;

import java.util.Arrays;

public class ArrayMerger {
    public int [] array (int [] arrayFirst, int [] arraySecond){
        int length = arrayFirst.length + arraySecond.length;
        int [] newArray = new int[length];
        for (int i = 0; i < length; i++) {
            if (arrayFirst[i] > arraySecond[i]) {
                newArray[i] = arrayFirst[i];
            } else {
                newArray[i] = arraySecond[i];
            }
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


    public static void main(String[] args) {
        int [] one = {3, 4,2,1,4,0,4,9,1,5};
        int [] two = {4,1,3,5,2,7,0,4};
        ArrayMerger arrayMerger = new ArrayMerger();
        int [] multiple = arrayMerger.array(one, two);
    }
}
