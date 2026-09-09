package com.Spring_Boot.Spring_Class01.Model;

public class StudentModel {
    private String name;
    private String course;

    
    public StudentModel() {
        
    }
    
    // Setter's
    public void setCourse(String course) {
        this.course = course;
    }
    void setName(String name) {
        this.name = name;
    }
    

    // Getter's
    public String getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }

    
}
