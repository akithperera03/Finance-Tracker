package com.example.finance.controller;

import com.example.finance.dto.TransactionDTO;
import com.example.finance.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    private final DashboardService dashboardService;

    @Autowired
    public DashboardController(DashboardService dashboardService) {
        this.dashboardService = dashboardService;
    }

    @GetMapping("/dashboard")
    public String viewDashboard(Model model) {
        model.addAttribute("summary", dashboardService.getFinancialSummary());
        model.addAttribute("recentTransactions", dashboardService.getRecentTransactions());
        return "dashboard";
    }



}
