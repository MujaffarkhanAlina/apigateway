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

@GetMapping("getbooks1")
	 public List<Book> getBook1(){
		 
		 return bookList;
	 }
	 

	 @GetMapping("getbooks2")
	 public List<Book> getBook2(){
		 
		 return bookList;
	 }
	 
	  @GetMapping("getbooks3")
	 public List<Book> getBook3(){
<<<<<<< HEAD
		 
		 return bookList;
	 }
	 
	   @GetMapping("getbooks4")
	 public List<Book> getBook4(){
		 
		 return bookList;
	 }
=======
    return bookList;
}
>>>>>>> 1eb9ac6a85c3d7b9316a08ce44b94f7f39d3928d


}
