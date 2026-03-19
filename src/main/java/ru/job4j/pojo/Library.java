package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1984 = new Book("1984", 100);
        Book cleanCode = new Book("Clean code", 1000);
        Book secret = new Book("The secret", 125);
        Book harryPotter = new Book("Harry Potter", 250);

        Book[] books = new Book[]{book1984, cleanCode, secret, harryPotter};
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }

        System.out.println("Переставьте местами книги с индексом 0 и 3");

        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }

        System.out.println("Добавьте цикл с выводом книг с именем \"Clean code\".");

        for (int i = 0; i < books.length; i++) {
            if ("Clean code".equals(books[i].getTitle())) {
                System.out.println(books[i]);
            }
        }
    }
}
