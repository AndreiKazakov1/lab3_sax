package com.sax;


import java.util.ArrayList;

//для описания модели содержания всех книг
//Данный класс содержит коллекцию для хранения данных полученных их XML, getters\setters.
// Так же метод push() для добавления данных из другого класса. Метод toString для вывода
// содержимого коллекции в строковом виде.

public class Catalog {
    private ArrayList<Book> books;

    public Catalog() {
        books = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void push(Book b) {
        books.add(b);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Book b : books) {
            sb.append(b.toString());
        }
        return sb.toString();
    }
}
