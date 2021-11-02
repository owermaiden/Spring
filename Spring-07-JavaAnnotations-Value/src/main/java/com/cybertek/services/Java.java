package com.cybertek.services;

import com.cybertek.interfaces.Course;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Java implements Course {

    @Value("EU7")
    private String batch;

    @Value("${instructor}")
    private String instructor;

    @Value("${days}")
    private String[] days;


    @Override
    public String toString() {
        return "Java{" +
                "batch='" + batch + '\'' +
                ", instructor='" + instructor + '\'' +
                ", days=" + Arrays.toString(days) +
                '}';
    }

    @Override
    public void getTeachingHours() {
        System.out.println("this is java");
    }
}
