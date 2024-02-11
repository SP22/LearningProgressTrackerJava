package tracker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Learning Progress Tracker");
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!"exit".equals(input)) {
            input = scanner.nextLine();
            if (input.isEmpty() || input.isBlank()) {
                System.out.println("No input.");
            } else if (!"exit".equals(input)) {
                System.out.println("Error: unknown command!");
            }
        }
        System.out.println("Bye!");
    }
}
