package com.keerthana.libraryapp.service;

import com.keerthana.libraryapp.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayServiceInfo() {
        System.out.println("BookService: Managing book service.");
        bookRepository.displayRepositoryInfo();
    }
}
