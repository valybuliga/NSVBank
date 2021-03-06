package web.api.nsvbank.account;

import java.util.ArrayList;
import java.util.List;
import web.api.nsvbank.transaction.Transaction;

/**
 *
 * @author Navjot Singh Virk
 * Date: Mon 21st November 2016
 * Time: 4:00 pm (Dublin,Ireland)
 * 
 * @Modification History
 * Modified on: 23rd November/2016 by Navjot at 7:45pm
 */

public class Account {
    //declaring data members
    private int id;
    private int accountNumber;
    private String sortCode;
    private Double currentBalance;
    List <Transaction> transactions;
    
    //constructor
    public Account(){
        id = 0;
        accountNumber = 0;
        sortCode = "";
        currentBalance = 0.0;
        transactions = new ArrayList<>();
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getId() {
        return id;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public Double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
    
}
