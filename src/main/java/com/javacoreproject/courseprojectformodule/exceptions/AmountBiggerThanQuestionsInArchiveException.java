package com.javacoreproject.courseprojectformodule.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class AmountBiggerThanQuestionsInArchiveException extends RuntimeException {
    public AmountBiggerThanQuestionsInArchiveException() {
    }

    public AmountBiggerThanQuestionsInArchiveException(String message) {
        super(message);
    }

    public AmountBiggerThanQuestionsInArchiveException(String message, Throwable cause) {
        super(message, cause);
    }

    public AmountBiggerThanQuestionsInArchiveException(Throwable cause) {
        super(cause);
    }

    public AmountBiggerThanQuestionsInArchiveException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
