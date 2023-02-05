package com.geekster.todo.controller;

import com.geekster.todo.model.Book;
import jakarta.annotation.Nullable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    @GetMapping("/getList")
    public Book getBook() {

        Book book = new Book();
            book.setBookId(1);
        book.setBookAuthor("John");
        book.setBookName("Tiger");
        return book;
    }

    @GetMapping("/getList/{id}")
    public Book getBookById(@PathVariable String id) {

        Book book = new Book();
        book.setBookId(Integer.parseInt(id));
        book.setBookAuthor("John-2");
        book.setBookName("Tiger-2");
        return book;
    }


}
