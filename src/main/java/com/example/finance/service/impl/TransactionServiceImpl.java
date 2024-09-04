package com.example.finance.service.impl;

import com.example.finance.dto.TransactionDTO;
import com.example.finance.model.Transaction;
import com.example.finance.repository.TransactionRepository;
import com.example.finance.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;

    @Autowired
    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public void saveTransaction(TransactionDTO transactionDTO) {
        Transaction transaction = new Transaction();
        // Map DTO to Entity and save
        transactionRepository.save(transaction);
    }

    @Override
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }
}
