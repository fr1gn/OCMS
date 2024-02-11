package org.online.repesitories;

import com.sun.jdi.connect.spi.Connection;
import org.online.com.Course;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import org.online.data.interfaces.IDB;
import org.online.com.User;
import org.online.data.interfaces.IDB;
import org.online.repesitories.interfaces.IUserRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserRepository implements IUserRepository {
    private final IDB db;  // Dependency Injection
    public CourseRepository(IDB db) {
        this.db = db;
    }
}



    @Override
    public boolean createUser(User user) {

    }



        @Override
    public User getUser(int userId) {
            java.sql.Connection con = null;

            try {s
                con = db.getConnection();
                String sql = "SELECT userId, firstName, lastName, email, password, role FROM users WHERE userid=?";
                PreparedStatement st = con.prepareStatement(sql);

                st.setInt(1, userId);

                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    return new user(rs.getInt("userId"),
                            rs.getString("firstName"),
                            rs.getString("lastName"),
                            rs.getString("email"),
                            rs.getString("password"),
                            rs.getString("role"));
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
    public List<User> getAllUsers() {
        Connection con = null
        try{
            con =






