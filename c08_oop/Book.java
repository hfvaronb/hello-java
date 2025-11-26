package c08_oop;

public class Book {
    // Atributos
    String title;
    String author;
    public Book() {

    }
    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    // Métodos
    public void showBook() {
        System.out.println("Titulo: " + title + " Author: " + author);
    }
}
