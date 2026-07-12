package trainappPrograms;

/*
 * Program: Exception Handling During Search
 * Purpose: Demonstrates exception handling by checking
 *          whether the train consist is empty before
 *          performing a search operation.
 */

import java.util.ArrayList;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC20 - Exception Handling During Search");
        System.out.println("======================================\n");

        ArrayList<String> bogieIds = new ArrayList<>();

        if (bogieIds.isEmpty()) {
            throw new IllegalStateException(
                    "No bogies available in train. Cannot perform search.");
        }

        String searchId = "BG309";

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                System.out.println("Bogie Found!");
                break;
            }
        }

        System.out.println("\nUC20 search completed...");
    }
}