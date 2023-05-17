package com.mostafa.controller;

import com.mostafa.model.PersonalInfo;
import com.mostafa.services.PersonalInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File com.mostafa.controller.UserController.java: PiiDataMasking-SpringBoot
 * @CreationDate 5/17/2023 2:36 PM
 */
@RestController
@RequestMapping("/infos")
public class PersonalInfoController {

    @Autowired
    private PersonalInfoService personalInfoService;

    @GetMapping
    public List<PersonalInfo> getAllInfos() {
        return personalInfoService.getAllInfos();
    }

    @GetMapping("/{id}")
    public PersonalInfo getInfo(@PathVariable int id) {
        return personalInfoService.getInfo(id);
    }
}
