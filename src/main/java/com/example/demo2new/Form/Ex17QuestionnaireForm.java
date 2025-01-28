package com.example.demo2new.Form;

import java.util.List;

public class Ex17QuestionnaireForm {
    private String name;
    private String gender;
    private List<Integer> hobbyList;
    private String langage;
    private String text;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public List<Integer> getHobbyList() {
        return hobbyList;
    }
    public void setHobbyList(List<Integer> hobbyList) {
        this.hobbyList = hobbyList;
    }
    public String getLangage() {
        return langage;
    }
    public void setLanguage(String langage) {
        this.langage = langage;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

}
