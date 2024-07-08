package userService;

public class User {
    private String id;
    private String pw;
    private String name;
    private boolean isLogin;

    User(String id, String pw){
        this.id = id;
        this.pw = pw;
    }

    public boolean isLogin() {
        return isLogin;
    }

    public void login() {
        isLogin = true;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    String getPw() {
        return pw;
    }

    void setPassword(String pw) {
        this.pw = pw;
    }

    String getId() {
        return id;
    }
}
