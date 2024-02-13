package org.online;

import org.online.controllers.CourseController;
import org.online.controllers.EnrollmentController;
import org.online.controllers.UserController;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyApplication {
    private final UserController controller;
    private final CourseController controller_2;
    private final EnrollmentController controller_3;
    private final Scanner scanner;

    public MyApplication(UserController controller, CourseController controller2, EnrollmentController controller3) {
        this.controller = controller;
        controller_2 = controller2;
        controller_3 = controller3;
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println();
            System.out.println("Welcome to My Application");
            System.out.println("Select option:");
            System.out.println("1. Get all users");
            System.out.println("2. Get user by id");
            System.out.println("3. Create user");
            System.out.println("4. Get all courses");
            System.out.println("5. Get course by id");
            System.out.println("6. Get all enrollments");
            System.out.println("0. Exit");
            System.out.println();
            try {
                System.out.print("Enter option (1-6): ");
                int option = scanner.nextInt();
                if (option == 1) {
                    getAllUsersMenu();
                } else if (option == 2) {
                    getUserByIdMenu();
                } else if (option == 3) {
                    createUserMenu();
                } else if (option == 4) {
                    getAllCoursesMenu();
                } else if (option == 5) {
                    getCourseByIdMenu();
                } else if (option == 6) {
                    getAllEnrollmentsMenu();
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input must be integer: " + e);
                scanner.nextLine(); // to ignore incorrect input
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("*************************");
        }
    }

    public void getAllUsersMenu() {
        String response = controller.getAllUsers();
        System.out.println(response);
    }

    public void getUserByIdMenu() {
        System.out.println("Please enter id");

        int id = scanner.nextInt();
        String response = controller.getUser(id);
        System.out.println(response);
    }

    public void createUserMenu() {
        System.out.println("Please enter your name:");
        String firstName = scanner.next();
        System.out.println("Please enter your surname:");
        String LastName = scanner.next();
        System.out.println("Please enter your email:");
        String email = scanner.next();
        System.out.println("Please enter your password:");
        String password = scanner.next();
        System.out.println("Please enter your role:");
        String role = scanner.next();

        String response = controller.createUser(firstName, LastName, email, password, role);
        System.out.println(response);
    }

    public void getCourseByIdMenu() {
        System.out.println("Please enter course id:");

        int id = scanner.nextInt();
        String response = controller_2.getCourse(id);
        System.out.println(response);
    }

    public void getAllCoursesMenu() {
        String response = controller_2.getAllCourses();
        System.out.println(response);
    }

    public void getAllEnrollmentsMenu() {
        String response = controller_3.getAllEnrollments();
        System.out.println(response);
    }

    public void enrollUserInCourseMenu(){

    }

}