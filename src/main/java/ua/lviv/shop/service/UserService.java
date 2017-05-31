package ua.lviv.shop.service;

import ua.lviv.shop.entity.User;

/**
 * Created by User on 31.05.2017.
 */
public interface UserService {
    User findById(Long id);
    User findByEmailAndPassword(String Email, String Password);

    void save(User user);
    void update(User user);
    void delete(User user);
}
