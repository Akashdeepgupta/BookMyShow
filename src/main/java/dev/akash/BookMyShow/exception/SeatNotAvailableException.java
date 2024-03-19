package dev.akash.BookMyShow.exception;

public class SeatNotAvailableException extends RuntimeException{
    public SeatNotAvailableException() {
        super();
    }

    public SeatNotAvailableException(String message) {
        super(message);
    }

    public SeatNotAvailableException(String message, Throwable cause) {
        super(message, cause);
    }

    public SeatNotAvailableException(Throwable cause) {
        super(cause);
    }

    protected SeatNotAvailableException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
