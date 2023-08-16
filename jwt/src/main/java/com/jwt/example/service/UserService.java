package com.jwt.example.service;

import com.jwt.example.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"santosh","santoshluitel19@outlook.com"));
        store.add(new User(UUID.randomUUID().toString(),"rojina","karkirojina84@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"muna","munaluitel18@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"bhagwati","bhagwatiluitel18@gmail.com"));
    }

    public List<User> getUsers() {
        return this.store;
    }
}
