package userService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserService();

        Scanner sc = new Scanner(System.in);
        int option = -1;
        String id = null;
        while (option != 0) {
            System.out.println("1. 회원가입 / 2. 로그인 / 3. 회원정보 수정 / 4. 탈퇴 / 0. 종료");
            System.out.print("입력: ");
            option = Integer.parseInt(sc.nextLine());

            String str = "";
            switch (option) {
                case 1:
                    System.out.println("<회원가입>");
                    System.out.print("아이디/비밀번호 입력: ");
                    str = sc.nextLine();
                    if ((id = userService.join(str)) == null) {
                        System.out.println("회원가입 중에 서비스가 비정상적으로 종료되었습니다.");
                    }
                    break;
                case 2:
                    System.out.println("<로그인>");
                    System.out.print("아이디/비밀번호 입력: ");
                    str = sc.nextLine();
                    if ((id = userService.login(str)) == null) {
                        System.out.println("로그인 중에 서비스가 비정상적으로 종료되었습니다.");
                    }
                    break;
                case 3:
                    if (id == null) {
                        System.out.println("로그인 상태가 아닙니다.");
                        break;
                    }
                    System.out.println("<회원정보 수정>");
                    System.out.print("비밀번호 입력: ");
                    String pwd = sc.nextLine();
                    System.out.print("이름 입력: ");
                    String name = sc.nextLine();
                    System.out.println(userService.modifyInfo(id, pwd, name));
                    break;
                case 4:
                    System.out.println("<탈퇴>");
                    System.out.println(userService.withdraw(id));
                    break;
                case 0:
                default:
                    System.out.println("서비스가 종료됩니다.");
            }
        }

    }
}