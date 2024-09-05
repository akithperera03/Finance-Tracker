package com.example.finance.service.impl;

import com.example.finance.dto.FinancialSummaryDTO;
import com.example.finance.model.Transaction;
import com.example.finance.model.TransactionType;
import com.example.finance.repository.TransactionRepository;
import com.example.finance.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class DashboardServiceImpl implements DashboardService {

    private final TransactionRepository transactionRepository;

    @Autowired
    public DashboardServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public FinancialSummaryDTO getFinancialSummary() {
        List<Transaction> transactions = transactionRepository.findAll();

        BigDecimal totalIncome = transactions.stream()
                .filter(t -> t.getCategory().getType() == TransactionType.INCOME)
                .map(Transaction::getAmount)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal totalExpense = transactions.stream()
                .filter(t -> t.getCategory().getType() == TransactionType.EXPENSE)
                .map(Transaction::getAmount)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        FinancialSummaryDTO summaryDTO = new FinancialSummaryDTO();
        summaryDTO.setTotalIncome(totalIncome);
        summaryDTO.setTotalExpense(totalExpense);
        summaryDTO.setNetBalance(totalIncome.subtract(totalExpense));

        return summaryDTO;
    }

    @Override
    public List<Transaction> getRecentTransactions() {
        return transactionRepository.findTop5ByOrderByDateDesc();
    }
}
