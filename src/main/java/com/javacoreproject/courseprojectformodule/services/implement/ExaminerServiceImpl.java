package com.javacoreproject.courseprojectformodule.services.implement;

import com.javacoreproject.courseprojectformodule.exceptions.AmountBiggerThanQuestionsInArchiveException;
import com.javacoreproject.courseprojectformodule.modals.Question;
import com.javacoreproject.courseprojectformodule.services.ExaminerService;
import com.javacoreproject.courseprojectformodule.services.QuestionService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Service
public class ExaminerServiceImpl implements ExaminerService
{
    Random random;
    QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        Set<Question> set = new HashSet<>();
        if (amount > questionService.getAll().size()) {
            throw new AmountBiggerThanQuestionsInArchiveException();
        }
        int itr = 0;
        while (itr <= amount) {
            set.add(questionService.getRandomQuestion());
            if (set.size() <= amount) {
                ++itr;
            }
        }
        return Set.copyOf(set);
    }
}
