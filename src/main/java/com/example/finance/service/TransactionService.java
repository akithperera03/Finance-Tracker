package com.example.finance.service;

import com.example.finance.dto.TransactionDTO;
import com.example.finance.model.Transaction;
import java.util.List;

public interface TransactionService {
    void saveTransaction(TransactionDTO transactionDTO);
    List<Transaction> getAllTransactions();
}
