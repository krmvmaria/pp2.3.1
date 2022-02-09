package src.dao;

import org.springframework.stereotype.Repository;
import src.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void add(User user) {
        entityManager.persist(user);
    }

    @Override
    public void delete(long id){
        entityManager.remove(findUserById(id));
    }

    @Override
    public User findUserById(long id){
        return entityManager.find(User.class, id);
    }

    @Override
    public User change(User user) {
        return entityManager.merge(user);
    }

    @Override
    public List<User> listUsers () {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }
}
