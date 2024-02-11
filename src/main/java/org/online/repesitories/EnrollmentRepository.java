package org.online.repesitories;

import org.online.com.Enrollment;
import org.online.data.interfaces.IDB;
import org.online.repesitories.interfaces.IEnrollmentRepository;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class EnrollmentRepository implements IEnrollmentRepository {
    private final IDB db;  // Dependency Injection
    public EnrollmentRepository(IDB db) {
        this.db = db;
    }


    @Override
    public void enrollUserInCourse(int userId, int courseId) {

    }

    @Override
    public List<Enrollment> getAllEnrollments() {

        Connection con = null;

        try {
            con = db.getConnection();
            String sql = "SELECT * FROM enrollments";
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);
            List<Enrollment> enrollments = new LinkedList<>();
            while (rs.next()) {
                Enrollment enrollment = new Enrollment();
                enrollment.setEnrollmentId(rs.getInt("enrollmentId"));
                enrollment.setUserId(rs.getInt("userId"));
                enrollment.setCourseId(rs.getInt("courseId"));
                enrollments.add(enrollment);
            }

            return enrollments;
        } catch (SQLException e) {
            System.out.println("sql error: " + e.getMessage());
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                System.out.println("sql error: " + e.getMessage());
            }
        }

        return null;
    }

    @Override
    public void updateEnrollment(Enrollment enrollment) {

    }

    @Override
    public void deleteEnrollment(int enrollmentId) {

    }
}
