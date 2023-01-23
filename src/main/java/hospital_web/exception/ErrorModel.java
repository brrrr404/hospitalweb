package hospital_web.exception;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ErrorModel {
    private String field;
    private String errorMessage;
    private String id;

    public ErrorModel(String field, String errorMessage) {
        this.field = field;
        this.errorMessage = errorMessage;
    }

    public ErrorModel(String field, String errorMessage, String id) {
        this.field = field;
        this.errorMessage = errorMessage;
        this.id = id;
    }
}
