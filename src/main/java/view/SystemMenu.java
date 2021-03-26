package view;

import java.util.Scanner;

public class SystemMenu implements InterfaceMenu {
    Scanner scanner = new Scanner(System.in);
    StudentMenu studentMenu = new StudentMenu();
    TeacherMenu teacherMenu = new TeacherMenu();
    @Override
    public void generateMenu() {
        while (true) {
            System.out.println("SYSTEM MENU");
            System.out.println("---------------------");
            System.out.println("Please enter your choice!!!");
            System.out.println("1.Student Manager");
            System.out.println("2.Teacher Manager");
            System.out.println("3.Exit program");
            System.out.println("Please enter your choice");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    studentMenu.generateMenu();
                    break;
                case 2:
                    teacherMenu.generateMenu();
                    break;
                case 3:
                    System.out.println("Goodbye!!!");
                    break;
                default:
                    System.out.println("Please choice again!!!");
                    break;
            }
            if (choice == 3) {
                break;
            }
        }

    }
}
