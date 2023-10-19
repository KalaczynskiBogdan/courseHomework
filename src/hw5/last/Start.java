package hw5.last;

import java.util.Scanner;

public class Start {
    Exercise exercise = new Exercise();

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("");
            System.out.println("what we do?");
            System.out.println("1. Show list of exercises");
            System.out.println("2. Show list of completed exercises");
            System.out.println("3. Make an exercise");
            System.out.println("4. Delete an exercise");
            System.out.println("5. Change an exercise");
            System.out.println("6. Make an exercise completed");
            System.out.println("7. Return deleted exercise");
            System.out.println("0. Finish program");

            int num = scanner.nextInt();
            switch (num) {
                case 0:
                    return;
                case 1:
                    exercise.displayExercises();
                    start();
                    break;
                case 2:
                    exercise.displayCompletedExercises();
                    start();
                    break;
                case 3:
                    exercise.createExercise();
                    start();
                    break;
                case 4:
                    exercise.deleteExercise();
                    start();
                    break;
                case 5:
                    exercise.changeExercise();
                    start();
                    break;
                case 6:
                    exercise.complete();
                    start();
                    break;
                case 7:
                    exercise.returnLastDeleted();
                    start();
                    break;
            }
        }
    }
}
