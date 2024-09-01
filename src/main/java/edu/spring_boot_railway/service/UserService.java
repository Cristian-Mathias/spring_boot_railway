package edu.spring_boot_railway.service;


import edu.spring_boot_railway.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userTocreate);
}
