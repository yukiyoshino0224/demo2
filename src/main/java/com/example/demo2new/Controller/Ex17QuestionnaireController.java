package com.example.demo2new.Controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
        hobbyMap.put(1, "野球");
        hobbyMap.put(2, "サッカー");
        hobbyMap.put(3, "テニス");
        model.addAttribute("hobbyMap", hobbyMap);

        // Map<Integer, String>langageMap = new LinkedHashMap<>();
        // langageMap.put(1, "Java");
        // langageMap.put(2, "SQL");
        // langageMap.put(3, "Linux");
        // model.addAttribute("langageMap", langageMap);

        return "Ex17/ex-17-input";
    }

    @RequestMapping("/createEx17")
    public String createEx17(Ex17QuestionnaireForm form, RedirectAttributes redirectAttributes){
        Questionnaire questionnaire = new Questionnaire();
        BeanUtils.copyProperties(form, questionnaire);

        List<String> hobbyList = new ArrayList<>();
        for(Integer hobbyCode:form.getHobbyList()){
            switch(hobbyCode){
                case 1:
                hobbyList.add("野球");
                break;
                case 2:
                hobbyList.add("サッカー");
                break;
                case 3:
                hobbyList.add("テニス");
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
