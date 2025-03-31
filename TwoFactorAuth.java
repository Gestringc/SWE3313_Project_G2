import java.util.Random;
import java.util.Scanner;

public class TwoFactorAuth {
    private static final String USERNAME = "user123";
    private static final String PASSWORD = "pass123";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter username: ");
        String inputUsername = input.nextLine();

        System.out.print("Enter password: ");
        String inputPassword = input.nextLine();

        if (authenticate(inputUsername, inputPassword)) {
            System.out.println("Login successful! Proceeding to 2FA...");

            if (perform2FA(input)) {
                System.out.println("Authentication successful! Access granted.");
            } else {
                System.out.println("2FA verification failed. Access denied.");
            }
        } else {
            System.out.println("Invalid username or password. Access denied.");
        }

        input.close();
    }
    private static boolean authenticate(String username, String password) {
        return USERNAME.equals(username) && PASSWORD.equals(password);
    }

    private static boolean perform2FA(Scanner scanner) {
        Random random = new Random();
        int verificationCode = 100000 + random.nextInt(900000); // Generate 6-digit code

        System.out.println("Your 2FA code is: " + verificationCode);
        System.out.print("Enter the 2FA code: ");

        int userCode = scanner.nextInt();
        return userCode == verificationCode;
    }
}
