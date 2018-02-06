package ru.job4j.array;

public class FindLoop {
    public int indexOf(int[] data, int el) {

        int rsl = -1; // если элемента нет в массиве, то возвращаем -1.

       for (int index = 0; index < data.length; index++) {
        //for (int index : data) {   пробовал для теста через for each, понял что плохая идея )
            if (data[index] == el) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }
}
