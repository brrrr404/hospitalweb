package hospital_web.model.common;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EnumDto {

    @Schema(name = "Уникальный код")
    private String id;

    @Schema(name = "Наименование")
    private String title;
}
