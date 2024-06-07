package vu.balexinstitute;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BalexInstitute {
    private static final Map<String, Courses> courses = new HashMap<>();

    public static void main(String[] args) {
        // Initialize the course details
        initializeCourses();

        // Prompt the user to enter the CourseID
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the CourseID: ");
        String courseID = scanner.nextLine();

        // Retrieve the course details based on the CourseID
        Courses course = courses.get(courseID);
        if (course != null) {
            System.out.println("Course Name: " + course.getCourseName());
            System.out.println("Tuition: $" + course.getTuition());
        } else {
            System.out.println("Wrong CourseID details");
        }
    }

    private static void initializeCourses() {
        courses.put("BSE", new Courses("BSE", "Software Engineering", 900000.0));
        courses.put("BIT", new Courses("BIT", "Information Technology", 750000.0));
        courses.put("BCS", new Courses("BCS", "Computer Science", 800000.0));
        courses.put("BCE", new Courses("BCE", "Computer Engineering", 950000.0));
    }
}
