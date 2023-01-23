package hospital_web.controller.common;

import hospital_web.model.common.EnumDto;
import hospital_web.service.common.CommonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "Общий для всех")
@RequestMapping("/api/common")
@RequiredArgsConstructor
public class CommonController {

    private final CommonService commonService;

    @ApiOperation(value = "Получить список департаментов")
    @GetMapping("/department-list")
    public List<EnumDto> getDepartmentList() {
        return commonService.getDepartmentList();
    }

    @ApiOperation(value = "Получить список должностей")
    @GetMapping("/position-list")
    public List<EnumDto> getPositionList() {
        return commonService.getPositionList();
    }
}
