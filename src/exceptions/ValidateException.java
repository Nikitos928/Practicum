package exceptions;

public class ValidateException extends Exception {
    public ValidateException(final String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}