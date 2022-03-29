package com.bms.workshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bms.workshop.model.Book;
import com.bms.workshop.service.BookService;

@Controller
public class BookController {

	@Autowired
	BookService bookservice;
	
	//get All Book
	@GetMapping("/getAllBooks")
	public ModelAndView getAllBooks()
	{
		List<Book> booklist = bookservice.getAllBooks();
		return new ModelAndView("displaybook","booklist", bookservice.getAllBooks());
	}
	
	
	@GetMapping("/addBook")
	public String showForm(Model model) {
		model.addAttribute("book", new Book());
		return "addbook";
	}
	
	@PostMapping("/addBook")
	public ModelAndView addBook(@ModelAttribute("book") Book book) {
		bookservice.addBook(book);
		return new ModelAndView("displaybook","booklist", bookservice.getAllBooks());
	}
	
	//delete book by id
	@GetMapping("/deleteBook/{id}")
	public ModelAndView deleteBook(@PathVariable int id) {
		bookservice.deleteBook(id);
		return new ModelAndView("displaybook","booklist", bookservice.getAllBooks());
	}
	
	//get Book by id
	@GetMapping("/getBookById")
	public String showFormID() {
		return "searchbyid";
	}
	
	@PostMapping("/getBookById")
	public ModelAndView getBookById(@RequestParam("id") int id) {
		Book book = bookservice.getBookById(id);
		return new ModelAndView("bookdetail","bookinfo", book);
	}
	
	
	//update book details
	@GetMapping("/edit/{id}")
	public ModelAndView showBook(@PathVariable int id) {
		Book book = bookservice.getBookById(id);
		return new ModelAndView("updatebook","book",book);	
	}
	
	@PostMapping("/updateBook")
	public ModelAndView updateBook(@ModelAttribute ("book") Book book) {
		bookservice.updateBook(book);
		return new ModelAndView("displaybook","booklist", bookservice.getAllBooks());
	}
	
}
