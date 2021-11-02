package com.cybertek.services;

import com.cybertek.interfaces.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {
    OfficeHours officeHours;

    public OfficeHours getOfficeHours() {
        return officeHours;
    }

    // This is a setter injection............
    @Autowired
    public void setOfficeHours(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    public void getTeachingHours() {
        System.out.println("Weekly teaching hours for selenium : " + officeHours.getHours());
    }
}
