package CameraRental;

import java.util.Scanner;

public class RentACamera {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Following is a list of available Camera(s)");
		MyCamera.ViewCameras();
		System.out.print("Enter the Camera ID you want to rent - ");
		int idToRent=sc.nextInt();
		System.out.println("Your transaction for Camera");
	}

}
