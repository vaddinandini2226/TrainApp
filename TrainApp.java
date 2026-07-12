package trainappPrograms;

/*
 * Program: Manual Sorting using Bubble Sort
 * Purpose: Demonstrates the Bubble Sort algorithm to
 *          sort passenger bogie capacities in ascending order.
 */

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC16 - Manual Sorting using Bubble Sort");
        System.out.println("======================================\n");

        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Original Capacities:");
        for (int capacity : capacities) {
            System.out.print(capacity + " ");
        }

        for (int i = 0; i < capacities.length - 1; i++) {

            for (int j = 0; j < capacities.length - 1 - i; j++) {

                if (capacities[j] > capacities[j + 1]) {

                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        System.out.println("\n\nSorted Capacities (Ascending):");
        for (int capacity : capacities) {
            System.out.print(capacity + " ");
        }

        System.out.println("\n\nUC16 sorting completed...");
    }
}