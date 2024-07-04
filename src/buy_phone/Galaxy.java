package buy_phone;

public class Galaxy extends Phone{
    public Galaxy(String user) {
        super(user, "삼송");
    }

    @Override
    void loading() {
        System.out.println("*** 폰 켜지는 중 ***\n");
    }
}
