package com.bookinventory.BookInventory.service;

import com.bookinventory.BookInventory.dto.AuthorDTO;
import com.bookinventory.BookInventory.entity.Author;
import com.bookinventory.BookInventory.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired private AuthorRepository repo;

    public Author addAuthor(AuthorDTO dto) {
        return repo.save(new Author(null, dto.getName(), dto.getEmail(), null));
    }
}
