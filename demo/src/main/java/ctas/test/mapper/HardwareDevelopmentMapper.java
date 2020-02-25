package ctas.test.mapper;

import ctas.test.entity.HardwareDevelopment;

public interface HardwareDevelopmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HardwareDevelopment record);

    int insertSelective(HardwareDevelopment record);

    HardwareDevelopment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HardwareDevelopment record);

    int updateByPrimaryKey(HardwareDevelopment record);
}