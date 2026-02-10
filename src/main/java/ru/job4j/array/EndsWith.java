package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = true;
        /* проверить. что массив word имеет последние элементы одинаковые с postfix */
        int offset = -postfix.length + word.length;
        for (int i = 0; i < postfix.length; i++) {
            if (word[i + offset] != postfix[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
