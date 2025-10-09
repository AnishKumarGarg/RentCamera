package CameraRental;

import java.util.Scanner;

public class MyCamera {
	static Scanner sc=new Scanner(System.in);
	
	public String Brand;
	public String Model;
	public int price;
	
	public static void Add(String Brand, String Model, int price) {
		//Code to add the camera into View Cameras
	}
	
	public static void Remove(int r) {
	}
	
	public static void ViewCameras() {
		
	}
	public static void GoBack() {
		new ShowOptions();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1. Add");
		System.out.println("2. Remove");
		System.out.println("3. View My Cameras");
		System.out.println("4. Go to previous Menu");
		
		int SelectedOption=sc.nextInt();
		
		if (SelectedOption==1) {
			System.out.print("Enter The Camera Brand - ");
			String Brand=sc.next();
			System.out.print("Enter The Camera Model - ");
			String Model=sc.next();
			System.out.print("Enter The Per Day Price (INR) - ");
			int price=sc.nextInt();
			Add(Brand, Model, price);
			System.out.println("Your Camera has successfully been added to the list");
		}
		
		if (SelectedOption==2) {
			ViewCameras();
			System.out.print("Enter the camera ID to remove - ");
			int r=sc.nextInt();
			Remove(r);
			System.out.println("Camera successfully removed from the list.");
		}
		
	}

}
