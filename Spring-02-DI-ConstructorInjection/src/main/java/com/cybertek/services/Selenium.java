package com.cybertek.services;

import com.cybertek.interfaces.Course;
import lombok.Data;

@Data
public class Selenium implements Course {
    private OfficeHours officeHours;  // Setter injection kullandık... config.xml'e bak...

    public void getTeachingHours() {
        System.out.println("Weekly Teaching hours : " + (15 + officeHours.getHours()));
    }

}
