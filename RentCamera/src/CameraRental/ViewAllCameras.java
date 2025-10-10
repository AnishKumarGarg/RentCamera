package CameraRental;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ViewAllCameras {
    static Scanner sc = new Scanner(System.in);

    static class ViewCameras {
        int id;
        String Brand;
        String Model;
        double price;
        String Availability;

        ViewCameras(int id, String Brand, String Model, double price, String Availability) {
            this.id = id;
            this.Brand = Brand;
            this.Model = Model;
            this.price = price;
            this.Availability = Availability;
        }

        static List<ViewCameras> Cameras = new ArrayList<>();
        static int nextId = 1;

        public static void AddSampleCameras() {
            Cameras.add(new ViewCameras(nextId++, "Canon", "EOS R10", 899.99, "Available"));
            Cameras.add(new ViewCameras(nextId++, "Nikon", "Z50", 849.99, "Available"));
            Cameras.add(new ViewCameras(nextId++, "Sony", "Alpha A6400", 999.99, "Rented"));
            Cameras.add(new ViewCameras(nextId++, "Fujifilm", "X-T30", 799.99, "Available"));
            Cameras.add(new ViewCameras(nextId++, "Panasonic", "Lumix G7", 699.99, "Available"));
            Cameras.add(new ViewCameras(nextId++, "Olympus", "OM-D E-M10", 649.99, "Rented"));
            Cameras.add(new ViewCameras(nextId++, "Canon", "EOS M50", 749.99, "Available"));
            Cameras.add(new ViewCameras(nextId++, "Nikon", "D5600", 599.99, "Available"));
            Cameras.add(new ViewCameras(nextId++, "Sony", "ZV-E10", 899.99, "Rented"));
            Cameras.add(new ViewCameras(nextId++, "GoPro", "Hero 10", 499.99, "Available"));
        }

        public static void AllCameras() {
            System.out.println("=======================================================================================");
            System.out.printf("%-12s%-20s%-20s%-15s%-25s%n", "Camera ID", "Brand", "Model", "Price Per Day", "Status");
            System.out.println("=======================================================================================");
            for (ViewCameras cam : Cameras) {
                System.out.printf("%-12d%-20s%-20s%-15.2f%-25s%n", cam.id, cam.Brand, cam.Model, cam.price, cam.Availability);
            }
            System.out.println("========================================================================================");
        }
    }

    public static void main(String[] args) {
        ViewCameras.AddSampleCameras();
        ViewCameras.AllCameras();
    }
}