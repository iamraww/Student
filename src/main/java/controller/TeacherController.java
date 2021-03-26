package controller;

import entity.Teacher;
import model.TeacherModel;
import model.TeacherModelImp;

import java.util.Scanner;

public class TeacherController {
    Scanner scanner = new Scanner(System.in);
    Teacher teacher = new Teacher();
    TeacherModel model = new TeacherModelImp();
    public void addTeacher(){
        System.out.println("ADD TEACHER");
        System.out.println("-----------------");
        System.out.println("Enter id :");
        teacher.setId(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter name :");
        teacher.setName(scanner.nextLine());
        System.out.println("Enter email :");
        teacher.setEmail(scanner.nextLine());
        System.out.println("Enter status (0 or 1) :");
        teacher.setStatus(scanner.nextInt());
        scanner.nextLine();
        model.save(teacher);
    }
    public void updateTeacher(){
        System.out.println("UPDATE TEACHER");
        System.out.println("----------------");
        System.out.println("Please enter id :");
        int findId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter name :");
        teacher.setName(scanner.nextLine());
        System.out.println("Enter email :");
        teacher.setEmail(scanner.nextLine());
        System.out.println("Enter status : ");
        teacher.setStatus(scanner.nextInt());
        scanner.nextLine();
        model.update(findId,teacher);
    }
    public void deleteTeacher(){
        System.out.println("DELETE TEACHER");
        System.out.println("------------------------------");
        System.out.println("Please enter id :");
        int findId = scanner.nextInt();
        scanner.nextLine();
        model.delete(findId);
    }
    public void findById(){
        System.out.println("FIND TEACHER INFO");
        System.out.println("-----------------");
        System.out.println("Please enter id :");
        int findId = scanner.nextInt();
        scanner.nextLine();
        model.findById(findId);
    }
    public void findAll(){
        System.out.println("TEACHER INFO");
        System.out.println("-----------------");
        model.findAll();
    }
}
