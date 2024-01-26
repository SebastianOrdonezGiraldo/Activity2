package User;


import java.util.Scanner;

public class UserMain {
    private boolean userLogin;
    private int password;

    public static void main(String[] args) {
        User user = new User();
        Scanner lector = new Scanner(System.in);
        System.out.println("Insert your password:");
        user.passwordBase = lector.nextInt();
        System.out.println(user.allowAcces());
        System.out.println("Check status");
        user.userBase = lector.nextBoolean();
        System.out.println(user.userBase);

    }
}
