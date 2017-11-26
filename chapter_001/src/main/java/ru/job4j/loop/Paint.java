package ru.job4j.loop;

public class Paint {
    public String piramid(int h) {

        StringBuilder builder = new StringBuilder();

        for (int x = 1; x <= h; x++) {
            for (int y = 1; y <= 2 * h - 1; y++) {
                if (y > h - x && y < h + x) {
                    builder.append("^");

                } else {
                    builder.append(" ");
                }
            }
            builder.append(System.getProperty("line.separator"));
        }
        return builder.toString();
    }
}
