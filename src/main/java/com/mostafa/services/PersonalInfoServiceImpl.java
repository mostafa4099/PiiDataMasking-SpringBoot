package com.mostafa.services;

import com.mostafa.model.PersonalInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File com.mostafa.services.UserServiceImpl.java: PiiDataMasking-SpringBoot
 * @CreationDate 5/17/2023 2:39 PM
 */
@Service
public class UserServiceImpl implements UserService{
    @Override
    public List<PersonalInfo> getAllUsers() {
        List<PersonalInfo> users = new ArrayList<>();

        users.add(new PersonalInfo(1, "Mostafa", "01737174099"));
        users.add(new PersonalInfo(2, "Mostafa", "01737174099"));

        return users;
    }

    @Override
    public PersonalInfo getUser(int id) {
        return getAllUsers().stream().filter(user -> user.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("user not found"));
    }
}
