package com.bookinventory.BookInventory.service;

import com.bookinventory.BookInventory.dto.CategoryDTO;
import com.bookinventory.BookInventory.entity.Category;
import com.bookinventory.BookInventory.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired private CategoryRepository repo;

    public Category addCategory(CategoryDTO dto) {
        return repo.save(new Category(null, dto.getName(), null));
    }
}
