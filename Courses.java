package vu.balexinstitute;

public class Courses {
    // Declare the required variables
    private String courseID;
    private String courseName;
    private double tuition;

    // Constructor to initialize the course details
    public Courses(String courseID, String courseName, double tuition) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.tuition = tuition;
    }

    // Getter methods for the course details
    public String getCourseID() {
        return courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getTuition() {
        return tuition;
    }
}
