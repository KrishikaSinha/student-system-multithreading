public interface RecordActions {
    void addStudent(Student s);
    void deleteStudent(Integer rollNo) throws StudentNotFoundException;
    void updateStudent(Integer rollNo, Student newData) throws StudentNotFoundException;
    Student searchStudent(Integer rollNo) throws StudentNotFoundException;
    void viewAllStudents();
}
