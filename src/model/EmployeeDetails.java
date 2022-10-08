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
    
    private String name;
    private String employee_Id;
    private String age;
    private String gender;
    private String start_Date;
    private String level;
    private String team_Info;
    private String position_Title;
    private String country_Code;
    private String cell_Phone_Number;
    private String email;
    private File photo;

    public String getcountry_Code() {
        return country_Code;
    }

    public void setcountry_Code(String country_Code) {
        this.country_Code =country_Code;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getemployee_Id() {
        return employee_Id;
    }

    public void setemployee_Id(String employee_Id) {
        this.employee_Id =employee_Id;
    }

    public String getage() {
        return age;
    }

    public void setage(String age) {
        this.age = age;
    }

    public String getgender() {
        return gender;
    }

    public void setgender(String gender) {
        this.gender = gender;
    }

    public String getstart_Date() {
        return start_Date;
    }

    public void setstart_Date(String start_Date) {
        this.start_Date = start_Date;
    }

    public String getlevel() {
        return level;
    }

    public void setlevel(String level) {
        this.level = level;
    }

    public String getteam_Info() {
        return team_Info;
    }

    public void setteam_Info(String team_Info) {
        this.team_Info = team_Info;
    }

    public String getposition_Title() {
        return position_Title;
    }

    public void setposition_Title(String position_Title) {
        this.position_Title = position_Title;
    }

    public String getcell_Phone_Number() {
        return cell_Phone_Number;
    }

    public void setcell_Phone_Number(String cell_Phone_Number) {
        this.cell_Phone_Number = cell_Phone_Number;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public File getphoto() {
        return photo;
    }

    public void setphoto(File photo) {
        this.photo = photo;
    }
    
    @Override
    public  String toString(){
        return name;
    }

   
    
    
    
    
}
