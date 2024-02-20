package tracker;

import java.util.ArrayList;
import java.util.List;

public class StudentStorage {
    private final List<Student> storage = new ArrayList<>();

    public boolean addStudent(Student student) {
        storage.add(student);
        return true;
    }
}
