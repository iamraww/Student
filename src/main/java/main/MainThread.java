package main;

import controller.StudentController;
import view.SystemMenu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MainThread {
    public static void main(String[] args) {
        SystemMenu menu = new SystemMenu();
        menu.generateMenu();
    }
}
