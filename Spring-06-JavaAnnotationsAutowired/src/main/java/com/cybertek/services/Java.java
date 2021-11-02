package com.cybertek.services;

import com.cybertek.interfaces.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {
    // we can also put autowired here as a field injection.............
    //@Autowired
    OfficeHours officeHours;

    // Constructor injection..There is no need if there is only one constructor...
    @Autowired
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : " + officeHours.getHours());
    }
}
