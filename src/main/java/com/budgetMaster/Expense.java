package com.budgetMaster;

import java.time.LocalDate;

public class Expense {
    private String description;
    private Double amount;
    private ExpenseCategory expenseCategory;
    private LocalDate date;

    public Expense(String description, Double amount, ExpenseCategory expenseCategory, LocalDate date) {
        this.description = description;
        this.amount = amount;
        this.expenseCategory = expenseCategory;
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public Double getAmount() {
        return amount;
    }

    public ExpenseCategory getExpenseCategory() {
        return expenseCategory;
    }

    public LocalDate getDate() {
        return date;
    }


}
