package com.example.demo2new.service;

import org.springframework.stereotype.Service;

import com.example.demo2new.domain.Questionnaire;

@Service
public class Ex17Service {

    public Questionnaire save(Questionnaire questionnaire){
        System.out.println("QuestionnaireServiceのsaveが呼ばれました");
        return questionnaire;
    }

}
