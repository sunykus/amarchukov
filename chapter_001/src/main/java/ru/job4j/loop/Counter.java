package ru.job4j.loop;

public class Counter {
    int y;
    public int add(int start, int finish) {
        for (int x = start; x <= finish; x++) {
            if (x % 2 == 0) {
                y += x;

            }
        }
        return y;
    }
}
