package hospital_web.model.authorization;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "Создание профиля")
public class ProfileDto {

    @Schema(name = "ФИО")
    private String fio;

    @JsonFormat(pattern = "DD.mm.yyyy")
    @Schema(name = "Дата рождения")
    private Date birthDate;

    @Schema(name = "Адрес")
    private String address;

    @JsonFormat(pattern = "^(\\([0-9]{3}\\))?[0-9]{3}-[0-9]{4}$")
    @Schema(name = "Номер телефона")
    private String phoneNumber;
}
