package com.bookinventory.BookInventory.repository;

import com.bookinventory.BookInventory.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {}
