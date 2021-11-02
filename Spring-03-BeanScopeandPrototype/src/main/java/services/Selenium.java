package services;

import interfaces.Course;
import lombok.Data;

public class Selenium implements Course {

    public void getTeachingHours() {

        System.out.println("Weekly Teaching hours : 15");
    }

}
