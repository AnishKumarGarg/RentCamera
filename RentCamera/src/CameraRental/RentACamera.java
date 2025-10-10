package CameraRental;

import java.util.Scanner;

import CameraRental.MyCamera.Camera;
import CameraRental.ViewAllCameras.ViewCameras;

public class RentACamera {
	static Scanner sc=new Scanner(System.in);
	static class Rent{
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ViewCameras.AllCameras();
		System.out.print("Enter the Camera ID you want to rent - ");
		int IdToRent=sc.nextInt();
		
	}

}
