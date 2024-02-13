package org.online.controllers;
import org.online.com.Enrollment;
import org.online.repesitories.interfaces.IEnrollmentRepository;
import java.util.List;
public class EnrollmentController {
    private final IEnrollmentRepository repo;

    public EnrollmentController(IEnrollmentRepository repo) {
        this.repo = repo;
    }

    public String enrollUserInCourse(int userId, int courseId) {
        repo.enrollUserInCourse(userId, courseId);
        return "User successfully enrolled in the course";
    }

    public String getAllEnrollments() {
        List<Enrollment> enrollments = repo.getAllEnrollments();
        StringBuilder response = new StringBuilder();
        for (Enrollment enrollment : enrollments) {
            response.append(enrollment.toString()).append("\n");
        }

        return response.toString();
    }

}
