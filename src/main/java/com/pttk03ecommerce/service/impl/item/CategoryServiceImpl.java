package com.pttk03ecommerce.service.impl.item;

import com.pttk03ecommerce.model.item.Category;
import com.pttk03ecommerce.repository.item.CategoryRepository;
import com.pttk03ecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(Category category) {
        Category category1 = categoryRepository.getByID(category.getID());
        category1.setName(category.getName());
        return categoryRepository.save(category1);
    }

    @Override
    public void deleteCategory(Integer id) {
        categoryRepository.deleteById(id);
    }
}
