package by.demeshko.composite.exception;

public class CompositeChainException extends Exception{

    public CompositeChainException() {
    }

    public CompositeChainException(String message) {
        super(message);
    }

    public CompositeChainException(String message, Throwable cause) {
        super(message, cause);
    }

    public CompositeChainException(Throwable cause) {
        super(cause);
    }

    public CompositeChainException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
