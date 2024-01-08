package com.javacoreproject.courseprojectformodule;

import com.javacoreproject.courseprojectformodule.modals.Question;
import com.javacoreproject.courseprojectformodule.services.implement.ExaminerServiceImpl;
import com.javacoreproject.courseprojectformodule.services.implement.JavaQuestionService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Set;

public class ExaminerServiceImplTest {
    @ExtendWith(MockitoExtension.class)
    @Mock
    private JavaQuestionService javaQuestionService;
    @InjectMocks
    private ExaminerServiceImpl examinerService;



    Question question1 = new Question("hi", "hiAgain");
    @Test
    void shouldReturnSetOfQuestions() {
        int amount = 2;
        Set<Question> set = new HashSet<>() ;
            set.add(question1);
            set.add(question1);
            set.add(question1);

        Mockito.when(javaQuestionService.getRandomQuestion()).thenReturn(question1);

        Assertions.assertEquals(set,examinerService.getQuestions(amount));


    }

}
