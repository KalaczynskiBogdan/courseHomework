package hw5.last;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise {
    ArrayList<String> listOfExercises = new ArrayList<>();
    ArrayList<String> listOfCompletedExercises = new ArrayList<>();
    public String deletedExercise = "";

    public void displayExercises() {
        if (listOfExercises.size() == 0) {
            System.out.println("You don't have any exercises yet");
        } else {
            System.out.println("Your list of Exercises");
            for (int i = 0; i < listOfExercises.size(); i++) {
                System.out.println("Exercise #" + i + ": " + listOfExercises.get(i));
            }
        }
    }

    public void displayCompletedExercises() {
        if (listOfCompletedExercises.size() == 0) {
            System.out.println("You don't have any completed exercises yet");
        } else {
            System.out.println("Your list of Completed exercises");
            for (int i = 0; i < listOfCompletedExercises.size(); i++) {
                System.out.println("Exercise #" + i + ": " + listOfCompletedExercises.get(i));
            }
        }
    }

    public void createExercise() {
        System.out.println("Make an exercise");
        Scanner scanner = new Scanner(System.in);
        String exercise = scanner.nextLine();
        listOfExercises.add(exercise);
        System.out.println("This exercise has created");
    }

    public void deleteExercise() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What exercise do u want to delete(choose the number): ");
        displayExercises();
        int number = scanner.nextInt();
        try {
            if (number <= listOfExercises.size()) {
                deletedExercise = listOfExercises.get(number);
                listOfExercises.remove(listOfExercises.get(number));
                System.out.println("This exercise has deleted");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("You don't have this exercise in your list");
        }
    }

    public void changeExercise() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("What exercise do u want to change(choose the number): ");
        displayExercises();
        int number = scanner1.nextInt();
        try {
            if (number <= listOfExercises.size()) {
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Change the exercise");
                String exercise = scanner2.nextLine();
                listOfExercises.set(number, exercise);
                System.out.println("You have changed the exercise");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("You don't have this exercise in your list");
        }
    }

    public void complete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What exercise do u want to make completed(choose the number): ");
        displayExercises();
        int number = scanner.nextInt();
        try {
            if (number <= listOfExercises.size()) {
                listOfCompletedExercises.add(listOfExercises.get(number));
                listOfExercises.remove(listOfExercises.get(number));
                System.out.println("You have completed this exercise");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("You don't have this exercise in your list");
        }
    }

    public void returnLastDeleted() {
        if (deletedExercise.isEmpty()) {
            System.out.println("You haven't deleted an exercise yet");
        } else {
            if (listOfExercises.contains(deletedExercise)) {
                System.out.println("Deleted exercise is already in the list");
            } else {
                listOfExercises.add(deletedExercise);
                System.out.println("You have returned the last deleted exercise");
            }
        }
    }
}
