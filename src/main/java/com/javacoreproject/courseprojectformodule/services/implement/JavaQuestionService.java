package com.javacoreproject.courseprojectformodule.services.implement;

import com.javacoreproject.courseprojectformodule.modals.Question;
import com.javacoreproject.courseprojectformodule.services.QuestionService;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class JavaQuestionService implements QuestionService {
     public  Set<Question> questions = new HashSet<>();

    private Set<Question> getQuestions() {
        return questions;
    }

    @Override
    public Question add(String question, String answer) {
        Question question1 = new Question(question, answer);
        add(question1);
        return question1;
    }

    @Override
    public Question add(Question question) {
        questions.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        questions.remove(question);
        return question;
    }


    Question question = new Question("a", "b");

    @Override
    public Collection<Question> getAll() {
        return Set.copyOf(questions);
    }

    @Override
    public Question getRandomQuestion() {
        Random random = new Random();
        int a = random.nextInt(questions.size());
        int i = 0;
        for (Question question:
             questions) {
            if (i == a) {
                return question;
            } else {
                ++i;
            }
        }
        return null;
    }
}
