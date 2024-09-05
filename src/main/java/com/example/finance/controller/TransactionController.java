package com.example.finance.controller;
import com.example.finance.model.Transaction;
import com.example.finance.repository.TransactionRepository;
import com.example.finance.dto.TransactionDTO;
import com.example.finance.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;

import java.util.List;

@Controller
public class TransactionController {

    private final TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("/transactions/new")
    public String showTransactionForm(Model model) {
        model.addAttribute("transaction", new TransactionDTO());
        return "transaction-entry";
    }

    @PostMapping("/transactions")
    public String saveTransaction(@Valid TransactionDTO transactionDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "transaction-entry";
        }
        transactionService.saveTransaction(transactionDTO);
        return "redirect:/dashboard";
    }

    @GetMapping("/transactions")
    public String viewTransactionHistory(Model model) {
        model.addAttribute("transactions", transactionService.getAllTransactions());
        return "transaction-history";
    }
        @Autowired
        private TransactionRepository transactionRepository;

        @GetMapping("/transaction-history")
        public String getTransactionHistory(Model model) {
            List<Transaction> transactions = transactionRepository.findAll();
            model.addAttribute("transactions",transactions);
            return "transaction-history";
        }
    }


