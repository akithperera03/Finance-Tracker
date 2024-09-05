package com.example.finance.service;

import com.example.finance.dto.FinancialSummaryDTO;
import com.example.finance.model.Transaction;
import java.util.List;

public interface DashboardService {
    FinancialSummaryDTO getFinancialSummary();
    List<Transaction> getRecentTransactions();
}
