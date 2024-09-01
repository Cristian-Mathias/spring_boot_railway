package edu.spring_boot_railway.service.impl;


import edu.spring_boot_railway.model.User;
import edu.spring_boot_railway.repository.UserRepository;
import edu.spring_boot_railway.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {
   private final UserRepository userRepository;

   public UserServiceImpl(UserRepository userRepository){
       this.userRepository = userRepository;
   }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userTocreate) {
        if (userRepository.existsByAccountNumber(userTocreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("Este número de conta já existe");
        }
       return userRepository.save(userTocreate);
    }
}
