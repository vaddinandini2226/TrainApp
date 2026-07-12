package trainappPrograms;

/*
 * Program: Group Bogies by Type
 * Purpose: Demonstrates the use of Java Streams to group
 *          bogies based on their type using Collectors.groupingBy().
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Bogie {

    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC9 - Group Bogies by Type");
        System.out.println("======================================\n");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));
        bogies.add(new Bogie("AC Chair", 60));

        System.out.println("All Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        System.out.println("\nGrouped Bogies:\n");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {

            System.out.println("Bogie Type: " + entry.getKey());

            for (Bogie b : entry.getValue()) {
                System.out.println("    Capacity -> " + b.capacity);
            }

            System.out.println();
        }

        System.out.println("UC9 grouping completed...");
    }
}