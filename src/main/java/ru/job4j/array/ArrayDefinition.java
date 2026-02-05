package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Ivan";
        names[1] = "Sergey";
        names[2] = "Alex";
        names[3] = "Irina";
        System.out.printf("%s\n%s\n%s\n%s\n\n", names[0], names[1], names[2], names[3]);
        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);
    }
}
