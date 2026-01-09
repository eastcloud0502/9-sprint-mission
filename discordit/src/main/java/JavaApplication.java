import entity.User;
import service.UserService;
import service.jcf.JCFUserService;

public class JavaApplication {
    public static void main(String[] args) {
        User user = new User("신동운", "ddd@gmail.com", "010-0101-0020");
        UserService userService = new JCFUserService();

        boolean addFalg = userService.addUser(user);
        if (addFalg) {
            System.out.println("추가 완료");
        } else
            System.out.println("추가 실패");

        System.out.println(userService.getAllUser());

    }
}
