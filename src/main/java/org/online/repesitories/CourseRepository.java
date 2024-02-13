package org.online.repesitories;

import org.online.com.Course;
import org.online.data.interfaces.IDB;
import org.online.repesitories.interfaces.ICourseRepository;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class CourseRepository implements ICourseRepository {
   private final IDB db;  // Dependency Injection
    public CourseRepository(IDB db) {
        this.db = db;
    }

    @Override
    public Course getCourseById(int courseId) {
        Connection con = null;

        try {
            con = db.getConnection();
            String sql = "SELECT courseId, courseName, instructor, description FROM courses WHERE id=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, courseId);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return new Course(rs.getInt("courseId"),
                        rs.getString("courseName"),
                        rs.getString("instructor"),
                        rs.getString("description"));
            }
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
    public List<Course> getAllCourses() {
        Connection con = null;

        try {
            con = db.getConnection();
            String sql = "SELECT courseId, courseName, instructor, description FROM courses";
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);
            List<Course> courses = new LinkedList<>();
            while (rs.next()) {
                Course course = new Course(rs.getInt("courseId"),
                        rs.getString("courseName"),
                        rs.getString("instructor"),
                        rs.getString("description"));

                courses.add(course);
            }

            return courses;
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
}