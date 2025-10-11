package CameraRental;

import java.util.Scanner;

public class MyWallet {
	static Scanner sc=new Scanner(System.in);
	public static double balance=5000;
	
	public static void ViewBalance() {
		System.out.println("Your current wallet balance is - INR"+ balance);
	}
	
	public static void AddToWallet(double ammount) {
		 if (ammount > 0) {
		            balance += ammount;
		            System.out.println("Your Wallet balance updated successfully. Current wallet balance - INR+"+balance);
		        } else {
		            System.out.println("Invalid amount. Please enter a positive value.");
		        }

	}
	public static void main(String[] args){
		    
		    MyWallet.ViewBalance();

		    System.out.print("Do you want to deposit more money to your wallet? (1.Yes 2.No) - ");
		    int ans = sc.nextInt();

		    if (ans == 1) {
		        System.out.print("Enter the amount - ");
		        double ammount = sc.nextDouble();
		        MyWallet.AddToWallet(ammount);
		    }
		}
		
    }

