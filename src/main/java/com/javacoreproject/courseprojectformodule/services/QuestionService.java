package com.javacoreproject.courseprojectformodule.services;

import com.javacoreproject.courseprojectformodule.modals.Question;
import org.springframework.stereotype.Service;

import java.awt.desktop.QuitEvent;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
@Service
public interface QuestionService {
    Question add(String question, String answer);

    Question add(Question question);

    Question remove(Question question);

    Map<String,String> getAll();

    Question getRandomQuestion();


}
