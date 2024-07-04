package buy_phone;

public abstract class Phone {
    String brand;

    public Phone(String brand) {
        this.brand = brand;
    }

    public Phone() {}

    abstract void loading();
}
