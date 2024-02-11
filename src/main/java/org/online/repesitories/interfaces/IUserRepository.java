package org.online.repesitories.interfaces;
import org.online.com.User;

import java.util.List;
public interface IUserRepository {
    boolean createUser(User user);
    User getUser(int userId);
    List<User> getAllUsers();
}
