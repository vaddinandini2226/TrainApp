package trainappPrograms;

/*
 * Program: Binary Search for Bogie ID
 * Purpose: Demonstrates the Binary Search algorithm
 *          to efficiently search for a bogie ID in a sorted array.
 */

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC19 - Binary Search for Bogie ID");
        System.out.println("======================================\n");

        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG550"
        };

        String searchId = "BG309";

        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = searchId.compareTo(bogieIds[mid]);

            if (result == 0) {
                found = true;
                break;
            } else if (result < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (found) {
            System.out.println("\nBogie " + searchId + " found using Binary Search.");
        } else {
            System.out.println("\nBogie " + searchId + " not found.");
        }

        System.out.println("\nUC19 search completed...");
    }
}