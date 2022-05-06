package demo;

public class Controller {
    public void go() {
        boolean running = true;
        UserInterface ui = new UserInterface();
        ui.intro();
        while (running) {
            ui.goodsPrice();
            ui.goodsAmount();
            running = ui.keepBuying();
            ui.calculateTotalBeforeTax();
            ui.calculateTotalAfterTax();
        }
        ui.printTotal();

    }
}
