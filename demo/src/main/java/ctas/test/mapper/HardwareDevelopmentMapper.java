package ctas.test.mapper;

import ctas.test.entity.HardwareDevelopment;
import ctas.test.entity.HardwareDevelopmentExample;
import ctas.test.entity.HardwareDevelopmentWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HardwareDevelopmentMapper {
    int countByExample(HardwareDevelopmentExample example);

    int deleteByExample(HardwareDevelopmentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HardwareDevelopmentWithBLOBs record);

    int insertSelective(HardwareDevelopmentWithBLOBs record);

    List<HardwareDevelopmentWithBLOBs> selectByExampleWithBLOBs(HardwareDevelopmentExample example);

    List<HardwareDevelopment> selectByExample(HardwareDevelopmentExample example);

    HardwareDevelopmentWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HardwareDevelopmentWithBLOBs record, @Param("example") HardwareDevelopmentExample example);

    int updateByExampleWithBLOBs(@Param("record") HardwareDevelopmentWithBLOBs record, @Param("example") HardwareDevelopmentExample example);

    int updateByExample(@Param("record") HardwareDevelopment record, @Param("example") HardwareDevelopmentExample example);

    int updateByPrimaryKeySelective(HardwareDevelopmentWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HardwareDevelopmentWithBLOBs record);

    int updateByPrimaryKey(HardwareDevelopment record);
}