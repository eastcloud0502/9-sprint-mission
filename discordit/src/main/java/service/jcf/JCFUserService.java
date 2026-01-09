package service.jcf;

import entity.User;
import service.UserService;

import java.util.ArrayList;
import java.util.List;

public class JCFUserService implements UserService {

    private final List<User> data;

    public JCFUserService() {
        this.data = new ArrayList<>();
    }

    @Override
    public List<User> addUser(User user) {
        return data;
    }

    @Override
    public User getUser(String displayName) {
        return null;
    }

    @Override
    public List<User> getAllUser() {
        return data;
    }

    @Override
    public User updateUser(String name, String email, String phoneNumber) {
        return null;
    }

    @Override
    public boolean deleteUser(String displayName) {
        return false;
    }
}
