package com.example.finance.service.impl;

import com.example.finance.dto.CategoryDTO;
import com.example.finance.model.Category;
import com.example.finance.model.TransactionType;
import com.example.finance.repository.CategoryRepository;
import com.example.finance.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void saveCategory(CategoryDTO categoryDTO) {
        Category category = new Category();
        category.setName(categoryDTO.getName());
        category.setType(TransactionType.valueOf(categoryDTO.getType()));
        categoryRepository.save(category);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}
