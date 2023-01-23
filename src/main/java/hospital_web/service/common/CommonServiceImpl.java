package hospital_web.service.common;

import hospital_web.entity.staff.DepartmentType;
import hospital_web.entity.staff.PositionType;
import hospital_web.model.common.EnumDto;
import hospital_web.model.common.EnumGetter;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CommonServiceImpl implements CommonService {

    @Override
    public List<EnumDto> getDepartmentList() {
        return Arrays.stream(DepartmentType.values()).map(EnumGetter::getDto).toList();
    }

    @Override
    public List<EnumDto> getPositionList() {
        return Arrays.stream(PositionType.values()).map(EnumGetter::getDto).toList();
    }
}
