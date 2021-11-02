package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {
    //@Autowired    // we can also put autowired here as a field injection.............
    //OfficeHours officeHours;
    // @Autowired
    // @Qualifier("mockInterviewHours")  // dependent bean lerden hangisinin kullanılacağını seçiyoruz...
    ExtraSessions extraSessions;

    // Constructor injection..There is no need if there is only one constructor...

    @Autowired
    public Java(@Qualifier("officeHours") ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }


    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : " + extraSessions.getHours());
    }
}
