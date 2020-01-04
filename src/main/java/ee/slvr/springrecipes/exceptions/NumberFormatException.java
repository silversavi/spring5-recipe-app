package ee.slvr.springrecipes.exceptions;

public class NumberFormatException extends RuntimeException {

    public NumberFormatException () {
        super();
    }

    public NumberFormatException(String message) {
        super(message);
    }

    public NumberFormatException(String message, Throwable cause){
        super(message, cause);
    }

//    @Override
//    public synchronized Throwable fillInStackTrace() {
//        return this;
//    }
}

