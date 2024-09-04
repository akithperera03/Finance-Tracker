package com.example.finance.service;

import java.util.Map;
import java.util.List;
import com.example.finance.model.Transaction;

public interface DashboardService {
    Map<String, Object> getFinancialSummary();
    List<Transaction> getRecentTransactions();
}
