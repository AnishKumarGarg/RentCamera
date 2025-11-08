package CameraRental;

public class CameraIdGenerator {
    private static int nextId = 1;

    public static int getNextId() {
        return nextId++;
    }
}