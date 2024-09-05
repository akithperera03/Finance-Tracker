package com.example.finance.repository;

import com.example.finance.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DashboardRepository {

    // You can add custom methods for aggregating data if needed
    // Example: Total income, total expenses, recent transactions
}
