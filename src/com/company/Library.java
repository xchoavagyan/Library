package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Library {

    HashMap<String,Book> books = new HashMap<>();


    // region Public Methods
    public void addBook(){
        Book book = new Book();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the book name ");
        book.setBookName(scanner.nextLine());
        System.out.println("Please enter the book author name ");
        book.setAuthorName(scanner.nextLine());
        System.out.println("Please enter the book genre ");
        book.setGenre(scanner.nextLine());
        System.out.println("Please enter the book publishing year ");
        book.setYear(scanner.nextInt());
        System.out.println("Please enter the number of pages ");
        book.setNumberOfPages(scanner.nextInt());
        books.put(book.getBookName(),book);
    }

    public void getBook(String bookName){
        System.out.println("Book Name : " + books.get(bookName).getBookName());
        System.out.println("Book author : " + books.get(bookName).getAuthorName());
        System.out.println("Book genre: " + books.get(bookName).getGenre());
        System.out.println("Book publishing year :" + books.get(bookName).getYear());
        System.out.println("The number of pages : " + books.get(bookName).getNumberOfPages());
    }
    //endregion

    //region Getters and Setters

    public HashMap<String, Book> getBooks() {
        return books;
    }

    public void setBooks(HashMap<String, Book> books) {
        this.books = books;
    }
    //endregion
}
