package buy_phone;

public class Main {
    public static void main(String[] args) {
        Person jobs = new Person("잡스");

        Person jDragon = new Person("재용");

        iPhone iPhone15 = new iPhone();
        jobs.buyPhone(iPhone15);
        jobs.turnOn();

        Galaxy galaxy23 = new Galaxy();
        jDragon.buyPhone(galaxy23);
        jDragon.turnOn();
    }
}
