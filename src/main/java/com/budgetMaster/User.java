package com.budgetMaster;

import jdk.jfr.Category;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private double monthlyBudget;
    private List<Expense> expenses;

    public User(String name, double monthlyBudget) {
        this.name = name;
        this.monthlyBudget = monthlyBudget;
    }

    public String getName() {
        return name;
    }

    public double getMonthlyBudget() {
        return monthlyBudget;
    }

    public void setExpenses(Expense expense) {
        this.expenses.add(expense);
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public void addExpense(Expense expense){
        if (expense.getAmount() > 0){
            setExpenses(expense);
        }else {
            System.out.println("NOPE");
        }
    }

    public List<Expense> getExpenseByCategory(ExpenseCategory category){
        List<Expense> expense_by_category = new ArrayList<>();
        for (Expense expense : expenses){
            if (expense.getExpenseCategory() == category){
                expense_by_category.add(expense);
            }
        }
        return expense_by_category;
    }


}