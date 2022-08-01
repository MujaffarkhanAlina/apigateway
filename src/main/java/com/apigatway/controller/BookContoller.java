package com.apigatway.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apigatway.model.Book;

@RestController
@RequestMapping("/book")
public class BookContoller {

      List<Book> bookList = new ArrayList();

	
	 @PostMapping("/add")
	 public List<Book> addBook(@RequestBody Book book){
		 
		 bookList.add(book);
		 return bookList;
	 }
	 
	 @GetMapping("getbooks")
	 public List<Book> getBook(){
		 
		 return bookList;
	 }




}
