package org.online.repesitories.interfaces;
import org.online.com.Course;
import org.online.com.Enrollment;

import java.util.List;
public interface ICourseRepository {
    Course getCourseById(int courseId);
    List<Course> getAllCourses();

}
