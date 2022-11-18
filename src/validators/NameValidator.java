package validators;

import exceptions.ValidateException;
import exceptions.ValidateNameException;

public class NameValidator implements Validator {
    @Override
    public void validate(String value) throws ValidateException {
        throw new ValidateNameException("Имя не должно быть пустым");
    }

// допишите код класса
}