package com.bms.workshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.workshop.model.Book;
import com.bms.workshop.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository bookrepo;
	
	
	//Add BOOK
	public void addBook(Book book) {
		bookrepo.save(book);
	}
	
	//get list of books
	public List<Book> getAllBooks(){
		return bookrepo.findAll();
	}

	public void deleteBook(int id) {
		bookrepo.deleteById(id);
		
	}

	public Book getBookById(int id) {
		Book book = bookrepo.getById(id);
		return book;
	}

	public void updateBook(Book book) {
		bookrepo.save(book);
		
	}
	

}
