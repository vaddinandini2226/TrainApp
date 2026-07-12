package trainappPrograms;

/*
 * Program: Performance Comparison (Loops vs Streams)
 * Purpose: Demonstrates the performance comparison between
 *          traditional loops and Java Streams for filtering
 *          bogies based on seating capacity.
 */

import java.util.ArrayList;
import java.util.List;
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
        System.out.println("UC13 - Performance Comparison (Loops vs Streams)");
        System.out.println("======================================\n");

        List<Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("AC Chair", 56));
            bogies.add(new Bogie("First Class", 24));
        }

        long loopStart = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        long loopEnd = System.nanoTime();

        long streamStart = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long streamEnd = System.nanoTime();

        System.out.println("Loop Execution Time (ns): " + (loopEnd - loopStart));
        System.out.println("Stream Execution Time (ns): " + (streamEnd - streamStart));

        System.out.println("\nUC13 performance benchmarking completed...");
    }
}