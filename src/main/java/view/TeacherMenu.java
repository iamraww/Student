package view;

import controller.StudentController;
import controller.TeacherController;

import java.util.Scanner;

public class TeacherMenu implements InterfaceMenu{
    Scanner scanner = new Scanner(System.in);
    TeacherController controller = new TeacherController();
    @Override
    public void generateMenu() {
        while (true){
            System.out.println("TEACHER MANAGER");
            System.out.println("--------------------");
            System.out.println("1.Add Teacher");
            System.out.println("2.Update Teacher");
            System.out.println("3.Find by id");
            System.out.println("4.Find all");
            System.out.println("5.Delete Teacher");
            System.out.println("6.Back");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    controller.addTeacher();
                    break;
                case 2:
                    controller.updateTeacher();
                    break;
                case 3:
                    controller.findById();
                    break;
                case 4:
                    controller.findAll();
                    break;
                case 5:
                    controller.deleteTeacher();
                    break;
                default:
                    break;
            } if(choice==6){
                break;
            }
        }
    }
}
