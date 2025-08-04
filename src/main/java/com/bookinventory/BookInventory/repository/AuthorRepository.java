package com.bookinventory.BookInventory.repository;
import com.bookinventory.BookInventory.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {}
