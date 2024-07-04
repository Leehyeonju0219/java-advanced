package buy_phone;

public class Main {
    public static void main(String[] args) {
        iPhone iPhone = new iPhone("잡스");
        Galaxy galaxy = new Galaxy("재용");

        iPhone.buyPhone();
        iPhone.turnOn();

        galaxy.buyPhone();
        galaxy.turnOn();
    }
}
