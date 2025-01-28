package com.example.demo2new.Form;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Ex17QuestionnaireForm {
    @NotBlank(message="値を入力してください")
    @Size(min= 1, max= 127, message="1桁以上127桁以下で入力してください")
    private String name;
    @Size(min= 1, max= 127, message="1桁以上127桁以下で入力してください")
    private String mail;
    @NotEmpty(message="値を入力してください")
    private String gender;
    @NotEmpty(message="値を入力してください")
    private List<Integer> hobbyList;
    private String langage;
    @Size(min= 1, max= 2000, message= "1桁以上2000桁以下で入力してください")
    private String text;

    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public void setLangage(String langage) {
        this.langage = langage;
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
