package org.online.repesitories.interfaces;
import org.online.com.User;

import java.util.List;
public interface IUserRepository {
    // default operations for IUserrepository
    User getUserById(int userId);
    List<User> getAllUsers();

}
