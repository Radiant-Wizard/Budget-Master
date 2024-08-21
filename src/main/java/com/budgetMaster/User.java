package com.budgetMaster;

import jdk.jfr.Category;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private Double monthlyBudget;
    private List<Expense> expenses;

    public User(String name, Double monthlyBudget) {
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
        return expenses.stream().filter(e -> e.getExpenseCategory() == category).toList();
    }

    public Double getTotalSpentThisMonth(){
        Double totalExpense = (double) 0;
        for (Expense expense : expenses){
            totalExpense += expense.getAmount();
        }
        return  totalExpense;
    }

    public Double getRemainingBudget(){
        return  this.monthlyBudget - getTotalSpentThisMonth();
    }

    public List<Category> getTopCategories(){
        List<Expense> sortedExpenses = new ArrayList<>();
        for (Expense expense : expenses){

        }

    }
}