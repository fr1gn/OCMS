package org.online.repesitories;

import com.sun.jdi.connect.spi.Connection;
import org.online.com.User;
import org.online.repesitories.interfaces.IUserRepository;

import java.util.List;

public class UserRepository implements IUserRepository {



    @Override
    public boolean createUser(User user) {

    }



        @Override
    public User getUser(int userId) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        Connection con = null
        try{
            con =






