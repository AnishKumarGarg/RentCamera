package CameraRental;

import java.util.Scanner;

public class Login {
    public static void AuthCheck(String username, String password) {
        if ((username != null && !username.equals("admin")) || (password != null && !password.equals("admin123"))) {
            System.out.println("Username or password is invalid");
        } else {
            ShowOptions.main(null); // Launch menu
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("+-------------------------------------------+");
        System.out.println("|   WELCOME TO CAMERA RENTAL APPLICATION    |");
        System.out.println("+-------------------------------------------+");
        System.out.println("Please Login to continue-");

        System.out.print("USERNAME - ");
        String username = sc.nextLine();

        System.out.print("PASSWORD - ");
        String password = sc.nextLine();

        AuthCheck(username, password);
    }
}
