package com.javacoreproject.courseprojectformodule;

import com.javacoreproject.courseprojectformodule.modals.Question;
import com.javacoreproject.courseprojectformodule.services.implement.JavaQuestionService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class JavaQuestionServiceTest {
    JavaQuestionService out = new JavaQuestionService();

    @Test
    void shouldAddQuestionCorrectly() {
        Question a = new Question("hi", "hiAgain");

        Assertions.assertEquals(a, out.add("hi", "hiAgain"));
    }

    @Test
    void shouldRemoveQuestionCorrectly() {
        Question b = new Question("hello", "bye");
        String a = "hello";
        Assertions.assertEquals(a, out.remove(b).getQuestion());
    }

    @Test
    void shouldReturnAllElementsInMap() {
        Map<String, String> map = new HashMap<>();
        Question a = new Question("a", "b");
        Question b = new Question("b", "a");
        map.put(a.getQuestion(), a.getAnswer());
        map.put(b.getQuestion(), b.getAnswer());
        out.add(a);
        out.add(b);

        Assertions.assertEquals(map,out.getAll());


    }
}
