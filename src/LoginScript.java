import java.util.Scanner;

public class LoginScript {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String username = "Admin";
        String password = "Password!";

        // input username
        System.out.println("Enter username");
        String getUsername = reader.nextLine();

        // tells you what your username is
        System.out.println("Your username is " + getUsername);

        // input password
        System.out.println("Enter password");
        String getPassword = reader.nextLine();

        // user enters their username and password
        if (getUsername.equals(username) && getPassword.equals(password)) {
            System.out.println("You have been validated!"); // Lets user know they are validated
        }
        else {
            System.out.println("Access not authorized!"); // Lets user know access is not authorizedA
        }
    }

}
