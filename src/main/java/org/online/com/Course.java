package org.online.com;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

public class Course {
    @Getter
    @Setter
    private int courseId;
    private String courseName;
    private String instructor;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;

}
