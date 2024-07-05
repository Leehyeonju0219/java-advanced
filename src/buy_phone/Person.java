package buy_phone;

public class Person {
    private String name;
    private Phone phone;

    public Person(String name) {
        this.name = name;
    }

    void buyPhone(Phone phone) {
        this.phone = phone;
        System.out.println(name + "님이 " + phone.brand + "폰을 구매했습니다.");
    }

    void turnOn() {
        System.out.println(name + "님이 " + phone.brand + "폰을 켰습니다.");
        phone.loading();
    }
}
