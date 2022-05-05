package demo;

import java.util.Scanner;

public class UserInterface {
    private double price;
    private int amount;
    private String state;
    private final double UTAH = 1.0685;

    Scanner in = new Scanner(System.in);

    public void intro() {
        System.out.println("Welcome to the ultimate web-shop, where the limit is your imagination!");
    }

    public void goodsAmount() {
        System.out.println("How many goods would you like to buy today?");
        amount = in.nextInt();
    }
    public void goodsPrice(){
        System.out.println("What is the price of your item? ");
        price = in.nextDouble();
    }
    public void stateChoice() {
        System.out.println("Which state do you have residence in?");
        state = in.nextLine();
    }
    public double calculateTotalAfterTax(){
        return price * amount * UTAH;
    }
    public double calculateTotalBeforeTax() {
        return price * amount;
    }
    public void printTotal(){
        System.out.println("total price before tax: " + calculateTotalBeforeTax());
        System.out.println("total price after tax:  " + calculateTotalAfterTax());
    }
}
