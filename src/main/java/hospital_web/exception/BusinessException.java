package hospital_web.exception;

import java.util.Collections;
import java.util.List;

public class BusinessException extends RuntimeException {
    private final List<ErrorModel> errors;

    public BusinessException(String field, String message) {
        super(message);
        errors = Collections.singletonList(new ErrorModel(field, message));
    }

    public BusinessException(String message) {
        this(null, message);
    }

    public List<ErrorModel> getErrors() {
        return errors;
    }
}
