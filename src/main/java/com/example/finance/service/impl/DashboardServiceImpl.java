package com.example.finance.service.impl;

import com.example.finance.service.DashboardService;
import com.example.finance.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import com.example.finance.model.Transaction;

@Service
public class DashboardServiceImpl implements DashboardService {

    private final TransactionRepository transactionRepository;

    @Autowired
    public DashboardServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public Map<String, Object> getFinancialSummary() {
        Map<String, Object> summary = new HashMap<>();
        // Implement logic to calculate total income, total expenses, etc.
        return summary;
    }

    @Override
    public List<Transaction> getRecentTransactions() {
        return transactionRepository.findTop5ByOrderByTransactionDateDesc();
    }
}
