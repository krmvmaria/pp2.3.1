package src.dao;

import src.model.User;
import java.util.List;

public interface UserDao {
    void add(User user);
    void delete(long id);
    void change(User user, long id);
    List<User> listUsers();
    User findUserById(long id);
}
