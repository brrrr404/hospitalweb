package hospital_web.entity.staff;

import hospital_web.model.common.EnumGetter;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DepartmentType implements EnumGetter {
    THERAPY("Терапия"),
    SURGERY("Хирургия"),
    PSYCHIATRY("Психиатрия"),
    PEDIATRICS("Педиатрия"),
    NEUROLOGY("Неврология"),
    STOMATOLOGY("Стоматология");

    private final String title;

    @Override
    public String getId() {
        return this.name();
    }
}
