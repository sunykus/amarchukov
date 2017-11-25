package ru.job4j.loop;

public class Board {

    public String paint(int width, int height) {

        StringBuilder builder = new StringBuilder();


        for (int n = 0; n < height; n++) {
            for (int y = 0; y < width; y++) {
                if ((n + y) % 2 == 0) {
                    builder.append("x");
                } else {
                    builder.append(" ");
                }
            }
            builder.append(System.getProperty("line.separator"));
        }
        String completedString = builder.toString();
        return completedString;
    }
}




