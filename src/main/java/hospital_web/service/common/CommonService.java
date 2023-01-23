package hospital_web.service.common;

import hospital_web.model.common.EnumDto;

import java.util.List;

public interface CommonService {
    List<EnumDto> getDepartmentList();

    List<EnumDto> getPositionList();
}
