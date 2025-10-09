package CameraRental;

import java.util.Scanner;

public class ShowOptions {
    public static void displayMenu() {
        System.out.println("1. My Camera");
        System.out.println("2. Rent a Camera");
        System.out.println("3. View all Cameras");
        System.out.println("4. My Wallet");
        System.out.println("5. Exit");

    }

    public static void SelectOption(int i) {
        switch (i) {
            case 1:
                new MyCamera().main(null);
                break;
            case 2:
                new RentACamera();
                break;
            case 3:
                new ViewCameras();
                break;
            case 4:
                new MyWallet();
                break;
            case 5:
                System.out.println("Thank you for using Camera Rental. Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            displayMenu();
            int option = sc.nextInt();
            SelectOption(option);
        }
    }
}
