package com.example.demo2new.Controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo2new.Form.Ex17QuestionnaireForm;
import com.example.demo2new.domain.Questionnaire;
import com.example.demo2new.service.Ex17Service;

@Controller
@RequestMapping("/ex17")
public class Ex17QuestionnaireController {
    @RequestMapping("")
    public String index(Model model){

        Map<Integer, String>hobbyMap = new LinkedHashMap<>();
        hobbyMap.put(1, "テニス");
        hobbyMap.put(2, "野球");
        hobbyMap.put(3, "ゴルフ");
        model.addAttribute("hobbyMap", hobbyMap);
        return "Ex17/ex-17-input";
    }

    @ModelAttribute
    public Ex17QuestionnaireForm setUpForm(){
        return new Ex17QuestionnaireForm();
    }

    @RequestMapping("/createEx17")
    public String createEx17(
        @Validated Ex17QuestionnaireForm form
        ,BindingResult result
        ,RedirectAttributes redirectAttributes
        ,Model model
        ){

        if(result.hasErrors()){
            return index(model);
        }

        Questionnaire questionnaire = new Questionnaire();
        BeanUtils.copyProperties(form, questionnaire);

        List<String> hobbyList = new ArrayList<>();

        for(Integer hobbyCode:form.getHobbyList()){
            switch(hobbyCode){
                case 1:
                hobbyList.add("テニス");
                break;
                case 2:
                hobbyList.add("野球");
                break;
                case 3:
                hobbyList.add("ゴルフ");
                break;
            }      
        }
        questionnaire.setHobbyList(hobbyList);

        Ex17Service ex17Service = new Ex17Service();
        questionnaire = ex17Service.save(questionnaire);

        redirectAttributes.addFlashAttribute("questionnaire", questionnaire);

        return "redirect:/ex17/toex17-result";
    }

    @RequestMapping("/toex17-result")
    public String toExResult(){
        return "Ex17/ex17-result";
    }
}
