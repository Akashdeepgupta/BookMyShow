package dev.akash.BookMyShow.exception;

public class InvalidUserNameAndPasswordException extends RuntimeException{
    public InvalidUserNameAndPasswordException() {
        super();
    }

    public InvalidUserNameAndPasswordException(String message) {
        super(message);
    }

    public InvalidUserNameAndPasswordException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidUserNameAndPasswordException(Throwable cause) {
        super(cause);
    }

    protected InvalidUserNameAndPasswordException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
