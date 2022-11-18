package com.pttk03ecommerce.repository.item;

import com.pttk03ecommerce.model.item.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    Category findByName(String name);

    Category getByID(Integer id);
}
