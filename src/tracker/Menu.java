package tracker;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);
    private String input = "";
    private final StudentStorage storage = new StudentStorage();
    public void run() {
        System.out.println("Learning Progress Tracker");
        while (!"exit".equals(input)) {
            input = scanner.nextLine();
            if (input.isEmpty() || input.isBlank()) {
                System.out.println("No input.");
            } else {
                switch (input) {
                    case "add students" -> addStudents();
                    case "exit" -> {
                    }
                    case "back" -> System.out.println("Enter 'exit' to exit the program");
                    default -> System.out.println("Error: unknown command!");
                }
            }
        }
        System.out.println("Bye!");
    }

    private void addStudents() {
        int count = 0;
        System.out.println("Enter student credentials or 'back' to return:");
        input = scanner.nextLine();
        while (!"back".equals(input)) {
            var student = StudentBuilder.createStudent(input);
            if (student != null) {
                storage.addStudent(student);
                System.out.println("The student has been added.");
                count++;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total %s students have been added.%n", count);
    }
}
