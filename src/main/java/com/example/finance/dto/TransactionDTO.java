package com.example.finance.dto;

import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransactionDTO {

    @NotNull
    private BigDecimal amount;

    private String description;

    @NotNull
    private LocalDateTime transactionDate;

    @NotNull
    private String type;

    @NotNull
    private Long categoryId;

    // Getters and setters

    public @NotNull BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(@NotNull BigDecimal amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public @NotNull LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(@NotNull LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    public @NotNull String getType() {
        return type;
    }

    public void setType(@NotNull String type) {
        this.type = type;
    }

    public @NotNull Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(@NotNull Long categoryId) {
        this.categoryId = categoryId;
    }
}
