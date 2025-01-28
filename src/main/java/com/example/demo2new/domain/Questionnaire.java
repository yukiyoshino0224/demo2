package com.example.demo2new.domain;

import java.util.List;

public class Questionnaire {
    private Integer id;
    private String name;
    private String gender;
    private List<String> hobbyList;
    private String langage;
    private String text;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
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
    public List<String> getHobbyList() {
        return hobbyList;
    }
    public void setHobbyList(List<String> hobbyList) {
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
