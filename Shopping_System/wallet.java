package Shopping_System;

import java.util.Scanner;

public class wallet extends ShoppingCart {
    double wallet_balance = 10;

    public static void balance(){
        double balance = 0;
        System.out.println("Your Balance is: " + balance);
    }

    public void recharge(double amount){
        wallet_balance += amount;
        System.out.println("Thanks for Recharging");
        System.out.println("Your New Balance is: " + wallet_balance);
    }

    public void updateBalance(double price){
        wallet_balance -= price;
        System.out.println("Your updated wallet balance is: " + wallet_balance);
    }

    public void bill(double price){
        if (price < wallet_balance) {
            System.out.println("Thanks for Purchasing");
            updateBalance(price);
        } else if(price > wallet_balance){
            System.out.println("Low Balance");
            double recharge_amount = price - wallet_balance;
            System.out.println("Please recharge your wallet with " + recharge_amount);
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the amount you want to recharge ");
            double amount = scanner.nextDouble();
            recharge(amount);
            scanner.close();
        }
    }
}
