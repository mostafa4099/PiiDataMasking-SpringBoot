package com.mostafa.services;

import com.mostafa.model.PersonalInfo;

import java.util.List;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File com.mostafa.services.UserService.java: PiiDataMasking-SpringBoot
 * @CreationDate 5/17/2023 2:38 PM
 */
public interface PersonalInfoService {
    List<PersonalInfo> getAllInfos();

    PersonalInfo getInfo(int id);
}
