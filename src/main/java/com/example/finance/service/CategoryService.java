package com.example.finance.service;

import com.example.finance.dto.CategoryDTO;
import com.example.finance.model.Category;
import java.util.List;

public interface CategoryService {
    void saveCategory(CategoryDTO categoryDTO);
    List<Category> getAllCategories();
}
