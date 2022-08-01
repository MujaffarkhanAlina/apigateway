package com.apigatway.model;

import org.springframework.stereotype.Service;

@Service
public class Book {

   private int bookId;
   private String bookName;
   private double price;

   
   public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}


}
