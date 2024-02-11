package org.online.repesitories.interfaces;
import org.online.com.Enrollment;
import java.util.List;

public interface IEnrollmentRepository {

    //Default operations for enrollment
    void enrollUserInCourse(int userId, int courseId);
    List<Enrollment> getAllEnrollments();
    void updateEnrollment(Enrollment enrollment);
    void deleteEnrollment(int enrollmentId);
}
