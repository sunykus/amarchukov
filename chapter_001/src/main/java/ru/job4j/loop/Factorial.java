package ru.job4j.loop;

public class Factorial {

    public int calc(int n) {
        int x = 1;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                x *= i;
            }
        } else {
            x = 1;
        }
        return x;
    }
}
