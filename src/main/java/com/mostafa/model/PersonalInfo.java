package com.mostafa.model;

import com.mostafa.mask.MaskData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File com.mostafa.model.User.java: PiiDataMasking-SpringBoot
 * @CreationDate 5/17/2023 2:37 PM
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonalInfo {
    private int id;
    private String name;
    @MaskData
    private String phoneNumber;
}
