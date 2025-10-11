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
	
	public static void Add(String Brand, String Model, double price) {
		int id = CameraRental.CameraIdGenerator.getNextId();
		
	    cameras.add(new Camera(id, Brand, Model, price));

	    CameraRental.ViewAllCameras.ViewCameras.Cameras.add(
	        new CameraRental.ViewAllCameras.ViewCameras(id, Brand, Model, price, "Available")
	    );
	}
	public static void Remove(int IdToRemove) {
	    boolean removedFromMyList = false;

	    // Remove from MyCamera's list
	    for (int i = 0; i < cameras.size(); i++) {
	        if (cameras.get(i).id == IdToRemove) {
	            cameras.remove(i);
	            removedFromMyList = true;
	            break;
	        }
	    }

	    // Remove from ViewAllCameras list
	    boolean removedFromAllList = false;
	    List<ViewAllCameras.ViewCameras> allCameras = CameraRental.ViewAllCameras.ViewCameras.Cameras;
	    for (int i = 0; i < allCameras.size(); i++) {
	        if (allCameras.get(i).id == IdToRemove) {
	            allCameras.remove(i);
	            removedFromAllList = true;
	            break;
	        }
	    }

	    if (removedFromMyList==true && removedFromAllList==true) {
			System.out.println("Camera successfully removed from the list");
		}
	    else {
	    	System.out.println("Camera does not exist");
	    }
	}	
	private static void renumberCameraIds() {
	    int newId = 1;

	    // Renumber MyCamera list
	    for (Camera cam : cameras) {
	        cam.id = newId++;
	    }

	    // Renumber ViewAllCameras list
	    newId = 1;
	    for (ViewAllCameras.ViewCameras cam : CameraRental.ViewAllCameras.ViewCameras.Cameras) {
	        cam.id = newId++;
	    }
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
			renumberCameraIds();
		}
		
		if (SelectedOption==3) {
			ViewCameras();
		}
		
		if (SelectedOption==4) {
			new ShowOptions();
		}
		
		
		
		
	}

}
