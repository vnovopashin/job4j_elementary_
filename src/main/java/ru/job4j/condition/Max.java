package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return right > left ? right : left;
    }

    public static int max(int left, int right, int up) {
        int temp = max(left, right);
        return max(temp, up);
    }

    public static int max(int left, int right, int up, int down) {
        int first = max(left, right);
        int second = max(up, down);
        return max(first, second);
    }
}
