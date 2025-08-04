package com.bookinventory.BookInventory.controller;

import com.bookinventory.BookInventory.dto.CategoryDTO;
import com.bookinventory.BookInventory.entity.Category;
import com.bookinventory.BookInventory.service.CategoryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private CategoryService service;

    @PostMapping
    public Category add(@Valid @RequestBody CategoryDTO dto) {
        return service.addCategory(dto);
    }
}