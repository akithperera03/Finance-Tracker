package com.example.finance.controller;

import com.example.finance.dto.CategoryDTO;
import com.example.finance.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;

@Controller
public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/categories")
    public String viewCategories(Model model) {
        model.addAttribute("categories", categoryService.getAllCategories());
        return "category-management";
    }

    @PostMapping("/categories")
    public String saveCategory(@Valid CategoryDTO categoryDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "category-management";
        }
        categoryService.saveCategory(categoryDTO);
        return "redirect:/categories";
    }
}
