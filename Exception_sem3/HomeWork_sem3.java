package Exception_sem3;

import java.io.IOException;
import java.util.Scanner;

public class HomeWork_sem3 {
    static Scanner sc = new Scanner(System.in, "ibm866");

    public static void main(String[] args) {
        System.out.println("Enter login: ");
        String login = sc.nextLine();
        System.out.println("Enter password: ");
        String password = sc.nextLine();
        System.out.print("Confirm password: ");
        String confirmPassword = sc.nextLine();
        boolean result = false;
        String pattern = "[A-Za-z0-9]+(_[A-Za-z0-9]+)*";
        try {
            result = validation(login, password, confirmPassword, pattern);
        } catch (Exception exc) {
            System.out.println("Вы ввели неверные данные: " + exc.getClass() + " => " + exc.getMessage());
        } finally {
            System.out.println(result);
        }

    }

    private static boolean validation(String login, String password, String confirmPass, String pattern)
            throws WrongLoginException, WrongPasswordException {
        try {
            loginChecker(login, pattern);
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
            throw new WrongLoginException("Invalid login", exc);
        }

        try {
            passwordChecker(password, pattern, confirmPass);
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
            throw new WrongPasswordException("Invalid password", exc);
        }

        return true;
    }

    private static void loginChecker(String login, String pattern) throws IOException {
        if (login.length() > 20) {
            throw new IOException("Длина login должна быть меньше 20 символов");
        }
        if (!login.matches(pattern)) {
            throw new IOException("Login должен содержать только латинские буквы, цифры и знак подчеркивания");
        }
    }

    private static void passwordChecker(String password, String pattern, String confirmPass) throws IOException {
        if (password.length() > 20) {
            throw new IOException("Длина password должна быть меньше 20 символов");
        }
        if (!password.matches(pattern)) {
            throw new IOException("Password должен содержать только латинские буквы, цифры и знак подчеркивания!");
        }
        if (!confirmPass.equals(password)) {
            throw new IOException("Пароли должны совпадать!");
        }
    }
}