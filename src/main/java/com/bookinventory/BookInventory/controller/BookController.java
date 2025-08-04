package com.bookinventory.BookInventory.controller;

import com.bookinventory.BookInventory.dto.BookDTO;
import com.bookinventory.BookInventory.entity.Book;
import com.bookinventory.BookInventory.service.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired private BookService service;

    @PostMapping
    public Book addBook(@Valid @RequestBody BookDTO dto) {
        return service.addBook(dto);
    }

    @GetMapping
    public List<Book> getAll() {
        return service.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable Long id) {
        return service.getBookById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteBook(id);
    }

    @GetMapping("/author/{id}")
    public List<Book> getByAuthor(@PathVariable Long id) {
        return service.getBooksByAuthor(id);
    }

    @GetMapping("/category/{id}")
    public List<Book> getByCategory(@PathVariable Long id) {
        return service.getBooksByCategory(id);
    }
}
