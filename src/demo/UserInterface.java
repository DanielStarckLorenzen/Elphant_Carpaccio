package demo;

import java.util.Scanner;

public class UserInterface {
    private double price;
    private int amount;
    private double totalPrice;
    private double totalPriceBeforeTax;
    private String state;
    private final double UTAH = 1.0685;
    private boolean buyMore;

    Scanner in = new Scanner(System.in);

    public void intro() {
        System.out.println("Welcome to the ultimate web-shop, where the limit is your imagination!");
    }
    public boolean keepBuying() {
        System.out.println("Do you want to buy more?");
        in.nextLine();
        String answer = in.nextLine().toLowerCase();
        switch(answer) {
            case "yes", "y" -> {
                return true;
            }
            default -> {
                return false;
            }
        }
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
        totalPrice += price * amount * UTAH;
        return totalPrice;
    }
    public double calculateTotalBeforeTax() {
        totalPriceBeforeTax += price * amount;
        return totalPriceBeforeTax;
    }
    public void printTotal(){
        System.out.println("total price before tax: $" + totalPriceBeforeTax);
        System.out.println("total price after tax:  $" + totalPrice);
    }
}
