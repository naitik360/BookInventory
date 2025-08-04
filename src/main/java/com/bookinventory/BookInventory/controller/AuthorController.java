package com.bookinventory.BookInventory.controller;

import com.bookinventory.BookInventory.dto.AuthorDTO;
import com.bookinventory.BookInventory.entity.Author;
import com.bookinventory.BookInventory.service.AuthorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {

    @Autowired
    private AuthorService service;

    @PostMapping
    public Author add(@Valid @RequestBody AuthorDTO dto) {
        return service.addAuthor(dto);
    }
}