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
public class PersonalInfoServiceImpl implements PersonalInfoService {
    @Override
    public List<PersonalInfo> getAllInfos() {
        List<PersonalInfo> infos = new ArrayList<>();

        infos.add(new PersonalInfo(1, "Mostafa", "01737174099"));
        infos.add(new PersonalInfo(2, "Mostafa", "01737174099"));

        return infos;
    }

    @Override
    public PersonalInfo getInfo(int id) {
        return getAllInfos().stream().filter(info -> info.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Not found"));
    }
}
