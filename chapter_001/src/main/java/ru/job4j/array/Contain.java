package ru.job4j.array;


public class Contain {


    boolean contain(String origin, String sub) {
        char[] originArray = origin.toCharArray();
        char[] subArray = sub.toCharArray();

        outer:
        for (int i = 0; i <= originArray.length - subArray.length; i++) {
            if (originArray[i] == subArray[0]) {
                for (int j = 1; j < subArray.length; j++) {
                    if (originArray[i + j] != subArray[j]) continue outer;
                }
                return true;
            }
        }
        return false;
    }
}



