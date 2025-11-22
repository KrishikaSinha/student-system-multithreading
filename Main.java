import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        int choice;

        do {
            System.out.println("\n===== Student Management Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Update Student");
            System.out.println("4. Search Student");
            System.out.println("5. View All Students");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            try {
                switch (choice) {

                    case 1:
                        System.out.print("Enter Roll No (Integer): ");
                        Integer r = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String n = sc.nextLine();

                        System.out.print("Enter Email: ");
                        String e = sc.nextLine();

                        System.out.print("Enter Course: ");
                        String c = sc.nextLine();

                        System.out.print("Enter Marks (Double): ");
                        Double m = sc.nextDouble();

                        // Validation
                        if (n.isEmpty() || e.isEmpty() || c.isEmpty() || m < 0 || m > 100) {
                            System.out.println("Invalid input values. Try again.");
                            break;
                        }

                        Student s = new Student(r, n, e, c, m);
                        manager.addStudent(s);
                        break;

                    case 2:
                        System.out.print("Enter Roll No to Delete: ");
                        manager.deleteStudent(sc.nextInt());
                        break;

                    case 3:
                        System.out.print("Enter Roll No to Update: ");
                        Integer ur = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter New Name: ");
                        String nn = sc.nextLine();

                        System.out.print("Enter New Email: ");
                        String ne = sc.nextLine();

                        System.out.print("Enter New Course: ");
                        String nc = sc.nextLine();

                        System.out.print("Enter New Marks: ");
                        Double nm = sc.nextDouble();

                        Student newStu = new Student(ur, nn, ne, nc, nm);
                        manager.updateStudent(ur, newStu);
                        break;

                    case 4:
                        System.out.print("Enter Roll No to Search: ");
                        Student f = manager.searchStudent(sc.nextInt());
                        System.out.println();
                        f.displayInfo();
                        break;

                    case 5:
                        manager.viewAllStudents();
                        break;

                    case 6:
                        System.out.println("Program execution completed. Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid choice! Try again.");
                }

            } catch (StudentNotFoundException ex) {
                System.out.println("Error: " + ex.getMessage());
            }

        } while (choice != 6);

        sc.close();
    }
}
