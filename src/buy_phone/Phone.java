package buy_phone;

public abstract class Phone {
    String brand;

    public Phone(String brand) {
        this.brand = brand;
    }

    public Phone() {}

    void buyPhone() {
        System.out.println(user + "님이 " + brand + "폰을 구매했습니다.");
    }

    void turnOn() {
        System.out.println(user + "님이 " + brand + "폰을 켰습니다.");
        loading();
    }

    abstract void loading();
}
