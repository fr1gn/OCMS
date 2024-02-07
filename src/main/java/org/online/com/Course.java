package org.online.com;

import java.time.LocalDate;

public class Course {
    private int courseId;
    private String courseName;
    private String instructor;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;

    public int getCourseId() {
        return courseId;
    }



    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }
}
