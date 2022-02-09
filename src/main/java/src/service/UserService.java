package src.service;

import src.model.User;
import java.util.List;

public interface UserService {
    void add(User user);
    void delete(long id);
    void change(User user, long id);
    public List<User> listUsers();
    User findUserById(long id);
}
