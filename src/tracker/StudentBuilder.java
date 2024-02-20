package tracker;

import java.util.Arrays;

public class StudentBuilder {
    public static Student createStudent(String input) {
        String[] words = input.split(" ");
        if (words.length < 3) {
            System.out.println("Incorrect credentials");
            return null;
        }

        String firstName = words[0];
        String lastName = String.join(" ", Arrays.copyOfRange(words, 1, words.length - 1));
        String email = words[words.length - 1];
        if (!StudentValidator.validateFirstName(firstName)) {
            System.out.println("Incorrect first name");
            return null;
        }
        if (!StudentValidator.validateLastName(lastName)) {
            System.out.println("Incorrect last name");
            return null;
        }
        if (!StudentValidator.validateEmail(email)) {
            System.out.println("Incorrect email");
            return null;
        }
        return new Student(firstName, lastName, email);
    }
}
