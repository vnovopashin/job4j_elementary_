package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        //ab + ac > bc и ac + bc > ab и ab + bc > ac

        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }
}
