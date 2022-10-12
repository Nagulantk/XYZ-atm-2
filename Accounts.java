import java.util.ArrayList;

import java .util.*;
public class Accounts {
   private Card card;
    private int accountNumber;
    Server details=new Server();
   Accounts(int accountNumber,int balance)
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
        card=new Card(23456,5555,321);
        Server.setCards(card);
        Server.setList(card,accountNumber);
       Server.setList1(accountNumber,balance);
    }
    private int balance;

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getBalance() {
       return balance;
    }
}




