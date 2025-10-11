package CameraRental;

import java.util.Scanner;

import CameraRental.MyCamera.Camera;
import CameraRental.ViewAllCameras.ViewCameras;

public class RentACamera {
	static Scanner sc=new Scanner(System.in);
	static public void rent(int idToRent) {
	    for (ViewCameras cam : ViewAllCameras.ViewCameras.Cameras) {
	        if (idToRent == cam.id && cam.Availability.equals("Available")) {
	            if (cam.price > MyWallet.balance) {
	                System.out.println("Transaction failed due to insufficient wallet balance. Please deposit amount to your wallet.");
	                return;
	            }
	            cam.Availability = "Rented";
	            MyWallet.balance -= cam.price; // Deduct rent from wallet
	            System.out.println("Your transaction for Camera - " + cam.Brand + " " + cam.Model + " with rent INR " + cam.price + " has successfully completed.");
	            return;
	        }
	    }
	    System.out.println("Camera not found or already rented");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ViewCameras.AddSampleCameras();
		System.out.println("Following is a list of Camera(s)");
		ViewAllCameras.ViewCameras.AllCameras();
		System.out.print("Enter the Camera ID you want to rent - ");
		int IdToRent=sc.nextInt();
		rent(IdToRent);
		ShowOptions.main(args);
	}
}
