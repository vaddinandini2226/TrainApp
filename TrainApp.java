package trainappPrograms;

/*
 * Program: Handle Invalid Bogie Capacity
 * Purpose: Demonstrates custom exception handling by
 *          validating the seating capacity of a bogie.
 */

class InvalidCapacityException extends Exception {

    public InvalidCapacityException(String message) {
        super(message);
    }
}

class Bogie {

    String name;
    int capacity;

    public Bogie(String name, int capacity) throws InvalidCapacityException {

        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }

        this.name = name;
        this.capacity = capacity;
    }
}

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC14 - Handle Invalid Bogie Capacity");
        System.out.println("======================================\n");

        try {

            Bogie bogie1 = new Bogie("Sleeper", 72);
            System.out.println("Created Bogie: " + bogie1.name + " -> " + bogie1.capacity);

            Bogie bogie2 = new Bogie("AC Chair", 0);

        } catch (InvalidCapacityException e) {

            System.out.println("Error: " + e.getMessage());

        }

        System.out.println("\nUC14 exception handling completed...");
    }
}