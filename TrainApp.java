package trainappPrograms;

/*
 * Program: Map Bogie to Capacity
 * Purpose: Demonstrates the use of HashMap to store
 *          bogie names along with their seating capacities.
 */

import java.util.HashMap;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC6 - Map Bogie to Capacity (HashMap)");
        System.out.println("======================================\n");

        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        bogieCapacity.put("First Class", 24);
        bogieCapacity.put("Cargo", 120);
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 56);

        System.out.println("Bogie Capacity Details:");

        for (String key : bogieCapacity.keySet()) {
            System.out.println(key + " ---> " + bogieCapacity.get(key));
        }

        System.out.println("\nUC6 bogie-capacity mapping completed...");
    }
}