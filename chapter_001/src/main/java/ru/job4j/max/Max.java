package ru.job4j.max;

public class Max {

    public int returnMax(int first, int second) {
        return first > second ? first : second;
    }

    public int max(int first, int second, int third) {
        return Math.max(this.returnMax(first, second), third);
    }
}