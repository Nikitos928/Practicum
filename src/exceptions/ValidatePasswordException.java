package exceptions;

public class ValidatePasswordException extends ValidateException {
    public ValidatePasswordException(final String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}