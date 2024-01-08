package com.javacoreproject.courseprojectformodule.exceptions;

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
