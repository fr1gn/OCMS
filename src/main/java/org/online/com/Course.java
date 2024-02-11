package org.online.com;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Course {
    private int courseId;
    private String courseName;
    private String instructor;
    private String description;
}
