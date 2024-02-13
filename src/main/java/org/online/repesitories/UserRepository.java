package org.online.repesitories;
import org.online.com.User;
import org.online.data.interfaces.IDB;
import org.online.repesitories.interfaces.IUserRepository;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;
public class UserRepository implements IUserRepository {
    private final IDB db;  // Dependency Injection

    public UserRepository(IDB db) {
        this.db = db;
    }


    @Override
    public boolean createUser(User user) {
        Connection con = null;

        try {
            con = db.getConnection();
            String sql = "INSERT INTO users (firstName, LastName, email, password, role) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, user.getFirstName());
            st.setString(2, user.getLastName());
            st.setString(3, user.getEmail());
            st.setString(4, user.getPassword());
            st.setString(5, user.getRole());
            st.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                System.out.println("sql error: " + e.getMessage());
            }
        }

        return false;
    }



    @Override
    public User getUser(int userId) {
        java.sql.Connection con = null;

        try {
            con = db.getConnection();
            String sql = "SELECT userId, firstName, lastName, email, password, role FROM users WHERE userid=?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, userId);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return new User(
                        rs.getString("firstName"),
                        rs.getString("LastName"),
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
        {
            Connection con = null;

            try {
                con = db.getConnection();
                String sql = "SELECT userId, firstName, lastName, email, password, role FROM users";
                Statement st = con.createStatement();

                ResultSet rs = st.executeQuery(sql);
                List<User> users = new LinkedList<>();
                while (rs.next()) {
                    User user = new User(
                            rs.getString("firstName"),
                            rs.getString("lastName"),
                            rs.getString("email"),
                            rs.getString("password"),
                            rs.getString("role"));

                    users.add(user);
                }

                return users;
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
}







