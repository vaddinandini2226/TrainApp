/*
 * Program: Track Unique Bogie IDs
 * Purpose: Demonstrates the use of HashSet to store
 *          unique bogie IDs by automatically removing duplicates.
 * Author : Vaddi Nandini
 */
package trainappPrograms;
import java.util.HashSet;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("======================================\n");

        HashSet<String> bogieIds = new HashSet<>();

        bogieIds.add("BG104");
        bogieIds.add("BG103");
        bogieIds.add("BG102");
        bogieIds.add("BG101");
        bogieIds.add("BG101");
        bogieIds.add("BG102");

        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogieIds);

        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically ignored by HashSet.");

        System.out.println("\nUC3 uniqueness validation completed...");
    }
}