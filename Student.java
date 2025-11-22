public class Student {

    private Integer rollNo;
    private String name;
    private String email;
    private String course;
    private Double marks;
    private char grade;

    public Student(Integer rollNo, String name, String email, String course, Double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.email = email;
        this.course = course;
        this.marks = marks;
        calculateGrade();
    }

    public void calculateGrade() {
        if (marks >= 85) grade = 'A';
        else if (marks >= 70) grade = 'B';
        else if (marks >= 50) grade = 'C';
        else grade = 'D';
    }

    public void displayInfo() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name   : " + name);
        System.out.println("Email  : " + email);
        System.out.println("Course : " + course);
        System.out.println("Marks  : " + marks);
        System.out.println("Grade  : " + grade);
    }

    public Integer getRollNo() {
        return rollNo;
    }
}
