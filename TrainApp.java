package trainappPrograms;
/*
 * Program: Train Consist Management Application
 * Purpose: Initialize an empty train consist using an ArrayList
 *          and display the initial bogie count and train status.
 * Author : Vaddi Nandini
 */

import java.util.ArrayList;
import java.util.List;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("== Train Consist Management App ==");
        System.out.println("=================================\n");

        List<String> trainConsist = new ArrayList<>();

        System.out.println("Train initialized successfully...");
        System.out.println("Initial Bogie Count : " + trainConsist.size());
        System.out.println("Current Train Consist : " + trainConsist);

        System.out.println("\nSystem ready for operations...");
    }
}
