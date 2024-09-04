package com.example.finance.service;

import java.util.List;
import com.example.finance.dto.TransactionDTO;
import com.example.finance.model.Transaction;

public interface TransactionService {
    void saveTransaction(TransactionDTO transactionDTO);
    List<Transaction> getAllTransactions();
}
