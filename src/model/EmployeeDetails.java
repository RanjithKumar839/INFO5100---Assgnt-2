/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Image;
import java.io.File;

/**
 *
 * @author ranji
 */
public class EmployeeDetails {
    
    private String Name;
    private String Employee_ID;
    private String Age;
    private String Gender;
    private String Start_date;
    private String Level;
    private String Team_INFO;
    private String Position_Title;
    private String Cell_Phone_number;
    private String Email;
    private File Photo;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmployee_ID() {
        return Employee_ID;
    }

    public void setEmployee_ID(String Employee_ID) {
        this.Employee_ID = Employee_ID;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getStart_date() {
        return Start_date;
    }

    public void setStart_date(String Start_date) {
        this.Start_date = Start_date;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String Level) {
        this.Level = Level;
    }

    public String getTeam_INFO() {
        return Team_INFO;
    }

    public void setTeam_INFO(String Team_INFO) {
        this.Team_INFO = Team_INFO;
    }

    public String getPosition_Title() {
        return Position_Title;
    }

    public void setPosition_Title(String Position_Title) {
        this.Position_Title = Position_Title;
    }

    public String getCell_Phone_number() {
        return Cell_Phone_number;
    }

    public void setCell_Phone_number(String Cell_Phone_number) {
        this.Cell_Phone_number = Cell_Phone_number;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public File getPhoto() {
        return Photo;
    }

    public void setPhoto(File Photo) {
        this.Photo = Photo;
    }
    
    @Override
    public  String toString(){
        return Name;
    }

   
    
    
    
    
}
