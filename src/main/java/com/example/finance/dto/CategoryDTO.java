package com.example.finance.dto;

import jakarta.validation.constraints.NotBlank;

public class CategoryDTO {

    @NotBlank
    private String name;

    @NotBlank
    private String type;

    // Getters and setters

    public @NotBlank String getName() {
        return name;
    }

    public void setName(@NotBlank String name) {
        this.name = name;
    }

    public @NotBlank String getType() {
        return type;
    }

    public void setType(@NotBlank String type) {
        this.type = type;
    }
}
