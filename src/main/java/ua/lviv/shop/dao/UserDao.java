package ua.lviv.shop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.shop.entity.User;

/**
 * Created by User on 31.05.2017.
 */
public interface UserDao extends JpaRepository<User, Integer> {

    User findById(Long id);
    User findByEmailAndPassword(String email, String password);

}
