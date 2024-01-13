package com.javacoreproject.courseprojectformodule.controllers;

import com.javacoreproject.courseprojectformodule.modals.Question;
import com.javacoreproject.courseprojectformodule.services.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/exam/java")
public class JavaController {
    QuestionService questionService;

    public JavaController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping(path = "/add")
    public Question addQuestion(String question,String answer) {
        return questionService.add(question,answer);
    }
    @GetMapping(path = "/remove")
    public Question removeQuestion( String question, String answer) {
        Question question1 = new Question(question, answer);
        return questionService.remove(question1);
    }
    @GetMapping("/")
    public Collection<Question> getQuestions() {
        return questionService.getAll();
    }

}
