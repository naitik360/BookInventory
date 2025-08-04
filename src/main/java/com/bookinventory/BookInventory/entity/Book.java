package com.bookinventory.BookInventory.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import com.bookinventory.BookInventory.entity.Category;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private double price;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "author_id")
    private Author author;


    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "category_id")
    private Category category;
}
