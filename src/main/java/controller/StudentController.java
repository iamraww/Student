package controller;

import entity.Student;
import model.StudentModel;
import model.StudentModelImp;

import java.util.Scanner;

public class StudentController {
    StudentModel model = new StudentModelImp();
    Scanner scanner = new Scanner(System.in);
    Student student = new Student();
    public void addStudent(){
        System.out.println("ADD STUDENT");
        System.out.println("-----------------");
        System.out.println("Enter id : ");
        student.setId(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter name : ");
        student.setName(scanner.nextLine());
        System.out.println("Enter email : ");
        student.setEmail(scanner.nextLine());
        System.out.println("Enter status (0 or 1): ");
        student.setStatus(scanner.nextInt());
        scanner.nextLine();
        model.save(student);
    }
    public void updateStudent(){
        System.out.println("UPDATE STUDENT");
        System.out.println("--------------------");
        System.out.println("Please enter id : ");
        int findId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("New name");
        student.setName(scanner.nextLine());
        System.out.println("New email : ");
        student.setEmail(scanner.nextLine());
        System.out.println("New status (0 or 1): ");
        student.setStatus(scanner.nextInt());
        scanner.nextLine();
        model.update(findId ,student);
    }
    public void deleteStudent(){
        System.out.println("DELETE STUDENT");
        System.out.println("------------------------------");
        System.out.println("Please enter id :");
        int findId = scanner.nextInt();
        scanner.nextLine();
        model.delete(findId);
    }
    public void findById(){
        System.out.println("FIND STUDENT INFO");
        System.out.println("-----------------");
        System.out.println("Please enter id :");
        int findId = scanner.nextInt();
        scanner.nextLine();
        model.findById(findId);
    }
    public void findAll(){
        System.out.println("STUDENT INFO");
        System.out.println("-----------------");
        model.findAll();
    }
}
