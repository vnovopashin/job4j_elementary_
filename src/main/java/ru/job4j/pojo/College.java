package ru.job4j.pojo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd:MM:yyyy");
        student.setName("Pavel");
        student.setGroup("100500");
        student.setDateOfReceipt(LocalDateTime.now());
        System.out.printf(
                "Student: %s\nGroup: %s\nDate of receipt: %s",
                student.getName(), student.getGroup(),
                formatter.format(student.getDateOfReceipt()));
    }
}
