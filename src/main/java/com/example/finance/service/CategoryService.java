package com.example.finance.service;

import java.util.List;
import com.example.finance.dto.CategoryDTO;
import com.example.finance.model.Category;

public interface CategoryService {
    void saveCategory(CategoryDTO categoryDTO);
    List<Category> getAllCategories();
}
