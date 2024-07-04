package buy_phone;

public class iPhone extends Phone{
    public iPhone(String user) {
        super(user, "애플");
    }

    @Override
    void loading() {
        System.out.println("@@@ 폰 켜지는 중 @@@\n");
    }
}
