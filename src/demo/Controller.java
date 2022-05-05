package demo;

public class Controller {
    public void go(){
        boolean running = true;
        UserInterface ui = new UserInterface();
        ui.intro();
        while(running){
            ui.goodsAmount();
            ui.goodsPrice();
            ui.calculateTotalAfterTax();
            ui.printTotal();
            running = false;
        }

    }

    public static void main(String[] args) {
    new Controller().go();
        }
}
