/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.bank;

/**
 *
 * @author maggy
 */
public class BankAccount extends Bank{
    //Information of a user
    private String username;
    private String password;
    
    
    //Bank features
    private double balance;
    private double deposit;
    private double withdraw;
    
    
    
//    public BankAccount(){
//        username = "none";
//        balance = 0.0;
//    }
    
    public void createAccount(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public void setDeposit(double amount){
        deposit = amount;
    }
    
    public double getDeposit(){
        return deposit;
    }
    
    public void setWithdraw(double withdrawl){
        withdraw = withdrawl;
    }
    
    
}
