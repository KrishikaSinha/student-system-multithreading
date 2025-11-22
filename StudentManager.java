import java.util.HashMap;
import java.util.Map;

public class StudentManager implements RecordActions {

    private Map<Integer, Student> students = new HashMap<>();

    @Override
    public void addStudent(Student s) {
        // duplicate check
        if (students.containsKey(s.getRollNo())) {
            System.out.println("Error: Student with same roll number already exists!");
            return;
        }

        // simulate loading
        Thread loaderThread = new Thread(new Loader());
        loaderThread.start();
        try {
            loaderThread.join();
        } catch (InterruptedException e) {
            System.out.println("Loading interrupted.");
        }

        students.put(s.getRollNo(), s);
        System.out.println("Student added successfully!");
    }

    @Override
    public void deleteStudent(Integer rollNo) throws StudentNotFoundException {
        if (!students.containsKey(rollNo)) {
            throw new StudentNotFoundException("Student with roll no " + rollNo + " not found.");
        }
        students.remove(rollNo);
        System.out.println("Student deleted successfully!");
    }

    @Override
    public void updateStudent(Integer rollNo, Student newData) throws StudentNotFoundException {
        if (!students.containsKey(rollNo)) {
            throw new StudentNotFoundException("Student with roll no " + rollNo + " not found.");
        }

        students.put(rollNo, newData);
        System.out.println("Student updated successfully!");
    }

    @Override
    public Student searchStudent(Integer rollNo) throws StudentNotFoundException {
        if (!students.containsKey(rollNo)) {
            throw new StudentNotFoundException("Student with roll no " + rollNo + " not found.");
        }
        return students.get(rollNo);
    }

    @Override
    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        for (Student s : students.values()) {
            s.displayInfo();
            System.out.println("------------------------");
        }
    }
}
