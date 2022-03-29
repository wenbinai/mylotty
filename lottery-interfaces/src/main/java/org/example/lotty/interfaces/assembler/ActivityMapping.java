package org.example.lotty.interfaces.assembler;

import org.example.lotty.domain.activity.model.vo.ActivityVO;
import org.example.lotty.rpc.activity.deploy.dto.ActivityDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

/**
 * @description: 活动对象转换配置
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ActivityMapping extends IMapping<ActivityVO, ActivityDTO> {

    @Override
    List<ActivityDTO> sourceToTarget(List<ActivityVO> var1);

}
