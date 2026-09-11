package com.Spring_Boot.Spring_Class01.Model;

public class StudentModel {
    private int id;
    private String name;
    private String course;

    
    public StudentModel() {
        
    }
    public StudentModel(int id, String name, String course) {
        this.id  = id;
        this.name = name;
        this.course = course;
    }
    
    // Setter's
    public void setId(int id){
        this.id = id;
    }
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
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    
}
