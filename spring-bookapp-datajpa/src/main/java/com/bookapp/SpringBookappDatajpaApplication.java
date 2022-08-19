package com.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.model.Book;
import com.bookapp.service.BookserviceImpl;
import com.bookapp.service.IBookService;

@SpringBootApplication
public class SpringBookappDatajpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBookappDatajpaApplication.class, args);
	}

	@Autowired
	IBookService bookService;
	@Override
	public void run(String... args) throws Exception {
	Book book = new Book("Head first java",1,"kathy","Tech",9000);
	
	// bookService.addBook(book);
	bookService.getAll();
	}

}
