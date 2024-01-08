package com.javacoreproject.courseprojectformodule.services;

import com.javacoreproject.courseprojectformodule.modals.Question;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Set;

@Service
public interface ExaminerService {

    Set<Question> getQuestions(int amount);
}
