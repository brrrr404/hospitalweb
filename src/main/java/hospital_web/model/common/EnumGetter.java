package hospital_web.model.common;

public interface EnumGetter {
    String getId();

    String getTitle();

    default EnumDto getDto() {
        return new EnumDto(getId(), getTitle());
    }
}
