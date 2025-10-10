package CameraRental;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyCamera {
	static Scanner sc=new Scanner(System.in);
	
	static class Camera{
		int id;
		public String Brand;
		public String Model;
		public double price;
		
		Camera(int id, String Brand, String Model, double price){
			this.id=id;
			this.Brand=Brand;
			this.Model=Model;
			this.price=price;
	}
	
	}
	
	static List<Camera> cameras=new ArrayList<Camera>(); //Create list of cameras
	static int nextId=1;
	
	
	public static void Add(String Brand, String Model, double price) {
		//Code to add the camera into View Cameras
		cameras.add(new Camera(nextId++, Brand, Model, price));
	}
	
	public static void Remove(int IdToRemove) {
		cameras.remove(IdToRemove-1);
		
	}
		public static void ViewCameras() {
		    System.out.println("=============================================================================");
		    System.out.printf("%-15s%-20s%-20s%-15s%n", "Camera ID", "Brand", "Model", "Price Per Day");
		    System.out.println("=============================================================================");
		    for (Camera cam : cameras) {
		        System.out.printf("%-15d%-20s%-20s%-15.2f%n", cam.id, cam.Brand, cam.Model, cam.price);
		    }
		    System.out.println("=============================================================================");
	
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
			double price=sc.nextDouble();
			Add(Brand, Model, price);
			System.out.println("Your Camera has successfully been added to the list");
		}
		
		if (SelectedOption==2) {
			ViewCameras();
			System.out.print("Enter the camera ID to remove - ");
			int IdToRemove=sc.nextInt();
			Remove(IdToRemove);
			System.out.println("Camera successfully removed from the list.");
		}
		
		if (SelectedOption==3) {
			ViewCameras();
		}
		
		if (SelectedOption==4) {
			new ShowOptions();
		}
		
		
		
		
	}

}
