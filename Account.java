package Assg11_12;

import java.util.Scanner;

public class Account {
    //Instance Variable
    private String name;
    private long accNo;
    private long balance;
    Scanner sc = new Scanner(System.in);

    public void openAccount(){
        System.out.println("Enter The Name Of Account");
        name = sc.next();
        System.out.println("Enter Account Number");
        accNo = sc.nextLong();
        System.out.println("Enter Account Balance");
        balance = sc.nextLong();
    }

    public void addAmount(){
        System.out.println("Enter Amount You Want To Add");
        long amount = sc.nextLong();
        balance += amount;
        System.out.println("Total Account Balance is :" + balance + "$");
    }

    public void debitAmount(){
        System.out.println("Enter Amount You Want To debit");
        long amount = sc.nextLong();
        if (balance > amount) {
            balance -= amount;
            System.out.println("Total Account Balance is :" + balance + "$");
        }else
            System.out.println("Balance is less");
    }

    public static void main(String[] args) {
        Account acc = new Account();
        int choice = 0;
        while (choice < 4){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter The Choice \n 1. Open Accont \n 2. Add Amount \n 3. Debit Amount");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    acc.openAccount();
                    break;
                case 2:
                    acc.addAmount();
                    break;
                case 3:
                    acc.debitAmount();
                    break;
                default:
                    System.out.println("Invalid");
            }
        }
    }
}

