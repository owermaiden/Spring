package cybertek.services;

import cybertek.interfaces.Course;

public class Java implements Course {


    public void getTeachingHours() {
        System.out.println("Weekly Teaching hours : 20");
    }

    public void myInitMethod(){
        System.out.println("Inıt method called...");
    }

    public void myDestroyMethod(){
        System.out.println("Destroy method called...");
    }
}
