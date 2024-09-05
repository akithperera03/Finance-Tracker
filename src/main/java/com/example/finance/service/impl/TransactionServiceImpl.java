package com.example.finance.service.impl;

import com.example.finance.dto.TransactionDTO;
import com.example.finance.model.Category;
import com.example.finance.model.Transaction;
import com.example.finance.model.User;
import com.example.finance.repository.TransactionRepository;
import com.example.finance.service.TransactionService;
import com.example.finance.repository.CategoryRepository;
import com.example.finance.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;
    private final CategoryRepository categoryRepository;
    private final UserRepository userRepository;

    @Autowired
    public TransactionServiceImpl(TransactionRepository transactionRepository,
                                  CategoryRepository categoryRepository,
                                  UserRepository userRepository) {
        this.transactionRepository = transactionRepository;
        this.categoryRepository = categoryRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void saveTransaction(TransactionDTO transactionDTO) {
        Transaction transaction = new Transaction();
        transaction.setAmount(transactionDTO.getAmount());
        transaction.setDate(LocalDateTime.now());

        // Fetch Category and User
        Category category = categoryRepository.findById(transactionDTO.getCategoryId())
                .orElseThrow(() -> new RuntimeException("Category not found"));
        User user = userRepository.findById(transactionDTO.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        transaction.setCategory(category);
        transaction.setUser(user);

        transactionRepository.save(transaction);
    }

    @Override
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }
}
