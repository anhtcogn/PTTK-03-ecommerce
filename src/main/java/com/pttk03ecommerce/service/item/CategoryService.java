package com.pttk03ecommerce.service.item;

import com.pttk03ecommerce.model.item.Author;
import com.pttk03ecommerce.model.item.Category;

public interface CategoryService {
    Category addCategory(Category category);

    Category updateCategory(Category category);

    void deleteCategory(Integer id);
}
