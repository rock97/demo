package ctas.test.mapper;

import ctas.test.entity.HardwareDevelopmentApproveLog;

public interface HardwareDevelopmentApproveLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HardwareDevelopmentApproveLog record);

    int insertSelective(HardwareDevelopmentApproveLog record);

    HardwareDevelopmentApproveLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HardwareDevelopmentApproveLog record);

    int updateByPrimaryKey(HardwareDevelopmentApproveLog record);
}