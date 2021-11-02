package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;

public class Java implements Course {

    //OfficeHours officeHours; bu object olduğu için interface i inject ediyoruz..loosely coupled..
    ExtraSessions extraSessions;

    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    public void getTeachingHours() {
        System.out.println("Weekly Teaching hours : " + (20 + extraSessions.getHours()));
    }


}
