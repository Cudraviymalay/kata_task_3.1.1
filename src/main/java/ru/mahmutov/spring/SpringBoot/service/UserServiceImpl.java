package ru.mahmutov.spring.SpringBoot.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mahmutov.spring.SpringBoot.DAO.UserDAO;
import ru.mahmutov.spring.SpringBoot.models.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    @Transactional
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    @Transactional
    public User userById(int id) {
        return userDAO.userById(id);
    }

    @Override
    @Transactional
    public void update(int id, User updatedUser) {
        userDAO.update(id, updatedUser);
    }

    @Override
    @Transactional
    public void delete(int id) {
        userDAO.delete(id);
    }
}