package tracker;

public class StudentValidator {

    public static boolean validateFirstName(String firstName) {
        return firstName.matches("^(?!['-])(?!.*[-']{2,})[A-Za-z-']{2,}(?<!['-])$");
    }

    public static boolean validateLastName(String lastName) {
        return lastName.matches("^(?!['-])(?!.*[-']{2,})[A-Za-z'\\-\\s]{2,}(?<!['-])$");
    }

    public static boolean validateEmail(String email) {
        return email.matches("^[\\w.]+@\\w+\\.\\w+$");
    }
}
