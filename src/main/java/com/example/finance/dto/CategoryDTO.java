package com.example.finance.dto;

import jakarta.validation.constraints.NotBlank;

public class CategoryDTO {

    @NotBlank(message = "Category name is required")
    private String name;

    @NotBlank(message = "Category type is required")
    private String type;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
