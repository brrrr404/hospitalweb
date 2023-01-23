package hospital_web.entity.staff;

import hospital_web.model.common.EnumGetter;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PositionType implements EnumGetter {
    NEUROLOGIST("Невролог"),
    NEUROSURGEON("Нейрохирург"),
    FAMILY_DOCTOR("Семейный"),
    PEDIATRICIAN("Педиатр"),
    PSYCHIATRIST("Психиатр"),
    THERAPIST("Терапевт"),
    SURGEON("Хирург"),
    DENTIST("Стоматолог");


    private final String title;

    @Override
    public String getId() {
        return this.name();
    }
}
