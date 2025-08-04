package com.bookinventory.BookInventory.service;

import com.bookinventory.BookInventory.dto.BookDTO;
import com.bookinventory.BookInventory.entity.*;
import com.bookinventory.BookInventory.repository.*;
import com.bookinventory.BookInventory.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bookinventory.BookInventory.entity.Category;

import java.util.List;

@Service
public class BookService {

    @Autowired private BookRepository bookRepo;
    @Autowired private AuthorRepository authorRepo;
    @Autowired private CategoryRepository categoryRepo;

    public Book addBook(BookDTO dto) {
        Author author = authorRepo.findById(dto.getAuthorId())
                .orElseThrow(() -> new ResourceNotFoundException("Author not found"));

        Category category = categoryRepo.findById(dto.getCategoryId())
                .orElseThrow(() -> new ResourceNotFoundException("Category not found"));

        Book book = new Book((Long) null, dto.getTitle(), dto.getDescription(), dto.getPrice(), author, category);
        return bookRepo.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    public Book getBookById(Long id) {
        return bookRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Book not found"));
    }

    public void deleteBook(Long id) {
        bookRepo.deleteById(id);
    }

    public List<Book> getBooksByAuthor(Long authorId) {
        return bookRepo.findByAuthorId(authorId);
    }

    public List<Book> getBooksByCategory(Long categoryId) {
        return bookRepo.findByCategoryId(categoryId);
    }
}
