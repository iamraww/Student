package view;

import controller.StudentController;

import java.util.Scanner;

public class StudentMenu implements InterfaceMenu {
    Scanner scanner = new Scanner(System.in);
    StudentController controller = new StudentController();

    @Override
    public void generateMenu() {
        while (true) {
            System.out.println("STUDENT MENU");
            System.out.println("------------------");
            System.out.println("1.Add Student");
            System.out.println("2.Update Student");
            System.out.println("3.Find by id");
            System.out.println("4.Find All");
            System.out.println("5.Delete Student");
            System.out.println("6.Back");
            System.out.println("Please enter your choice!!!");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    controller.addStudent();
                    break;
                case 2:
                    controller.updateStudent();
                    break;
                case 3:
                    controller.findById();
                    break;
                case 4:
                    controller.findAll();
                    break;
                case 5:
                    controller.deleteStudent();
                    break;
                default:
                    break;
            }
            if (choice == 6) {
                break;
            }
        }

    }
}
