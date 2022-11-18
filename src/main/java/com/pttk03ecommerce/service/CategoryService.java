package com.pttk03ecommerce.service;

import com.pttk03ecommerce.model.item.Author;
import com.pttk03ecommerce.model.item.Category;
import com.pttk03ecommerce.model.item.Publisher;

import java.util.List;

public interface CategoryService {
    List<Category> getAll();
    Category addCategory(Category category);

    Category updateCategory(Category category);

    void deleteCategory(Integer id);
}
