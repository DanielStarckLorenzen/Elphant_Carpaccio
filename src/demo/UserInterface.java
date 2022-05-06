package demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {
    private double price;
    private int amount;
    private double totalPrice;
    private double totalPriceBeforeTax;
    private String state;
    private final double UTAH = 1.0685;
    private double tax;

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

    public void goodsAmount() throws InputMismatchException{
        try {
            System.out.println("How many of items do you want to buy?");
            amount = in.nextInt();
        }
        catch (InputMismatchException ime){
            System.out.println("Not a valid number. Try again: ");
        }
    }
    public void goodsPrice() throws InputMismatchException {
        try {
            System.out.println("What is the price of your item? ");
            price = in.nextDouble();
        }
        catch(InputMismatchException ime) {
            System.out.println("Please enter a valid number: ");
        }
    }
    public void stateChoice() {
        System.out.println("Which state do you have residence in?");
        state = in.nextLine();
        switch (state){
            case "ut", "UT", "Utah" -> tax = 1.0685;
            case "nv", "NV", "Nevada" -> tax = 1.08;
            case "tx", "TX", "Texas" -> tax = 1.0625;
            case "al", "AL", "Alabama" -> tax = 1.04;
            case "ca", "CA", "California" -> tax = 1.0825;
            default -> System.out.println("That's not a state in our system");
        }
    }
    public double calculateTotalAfterTax(){
        totalPrice += price * amount * tax;
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
