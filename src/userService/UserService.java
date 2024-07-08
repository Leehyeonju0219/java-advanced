package userService;

public class UserService {

    UserDAO dao;

    public UserService() {
        dao = new UserDAO();
    }


    //TODO: 회원가입, 1 -> 아이디 비번 입력받아 회원가입
    String join(String str){
        String[] infos = str.split(" ");
        String id = infos[0];
        String pw = infos[1];

        User user = new User(id,pw);

        if(dao.isValid(user.getId())){
            dao.save(user);
            user.login();
            System.out.println(id +"님, 가입을 환영합니다.");
            return id;
        }else{
            System.out.println("이미 있는 아이디입니다.");
        }

        return null;
    }

    //TODO: 로그인 아이디 비번 입력받아 로그인. 상태를 로그인으로 변경
    String login(String str){
        String[] infos = str.split(" ");
        String id = infos[0];
        String pw = infos[1];
        User user = dao.find(id);
        if(user == null){
            System.out.println("없는 유저입니다.");

        }else if(pw.equals(user.getPw())) {
            System.out.println("로그인 하셨습니다.");
            user.login();
            return user.getId();
        }else{
            System.out.println("틀린 비밀번호입니다.");
        }

        return null;
    }


    //TODO: 회원정보 수정, 3 -> 비번 이름 입력받아 수정
    String modifyInfo(String id, String pwd, String name) {
        if (!dao.isValid(id)) {
            User user = dao.find(id);
            if (user.isLogin()) {
                user.setName(name);
                user.setPassword(pwd);
            } else {
                return "로그인 상태가 아닙니다.";
            }
            dao.update(user);
            return "회원정보를 수정했습니다.";
        } else {
            return "회원이 아닙니다.";
        }
    }

    //TODO: 탈퇴, 4
    String withdraw(String id) {
        if (!dao.isValid(id)) {
            User user = dao.find(id);
            if (user.isLogin()) {
                dao.delete(id);
                return "탈퇴되었습니다.";
            } else {
                return "로그인 상태가 아닙니다.";
            }
        } else {
            return "회원이 아닙니다.";
        }
    }
}
