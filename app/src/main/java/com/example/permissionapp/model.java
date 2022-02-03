package com.example.permissionapp;

public class model {
    String Name, Email,Prn,Description,Subject,FromD,FromT,ToD,ToT;

    public model() {
    }

    public model(String subject, String email, String name, String prn) {
        this.Name = name;
        this.Email = email;
        this.Prn = prn;
        this.Subject = subject;

    }

    public model(String name, String email, String prn,  String subject, String description,String fromD,  String fromT, String toD,String toT) {
        Name = name;
        Email = email;
        Prn = prn;
        Description = description;
        Subject = subject;
        FromD = fromD;
        ToD = toD;
        FromT = fromT;
        ToT = toT;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getFromD() {
        return FromD;
    }

    public void setFromD(String fromD) {
        FromD = fromD;
    }

    public String getToD() {
        return ToD;
    }

    public void setToD(String toD) {
        ToD = toD;
    }

    public String getFromT() {
        return FromT;
    }

    public void setFromT(String fromT) {
        FromT = fromT;
    }

    public String getToT() {
        return ToT;
    }

    public void setToT(String toT) {
        ToT = toT;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getPrn() {
        return Prn;
    }

    public void setPrn(String prn) {
        Prn = prn;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

}
