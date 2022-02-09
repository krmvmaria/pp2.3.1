package src.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import src.dao.UserDao;
import src.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public void add (User user) {
        userDao.add(user);
    }

    @Transactional
    @Override
    public void delete (long id) {
        userDao.delete(id);
    }

    @Transactional
    @Override
    public void change (User user, long id) {
        userDao.change(user, id);
    }

    @Transactional
    @Override
    public List<User> listUsers () {
        return userDao.listUsers();
    }

    @Transactional
    @Override
    public User findUserById (long id) {
        return userDao.findUserById(id);
    }
}
