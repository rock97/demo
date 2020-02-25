package ctas.test.mapper;

import ctas.test.entity.HardwareDevelopmentApproveLog;
import ctas.test.entity.HardwareDevelopmentApproveLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HardwareDevelopmentApproveLogMapper {
    int countByExample(HardwareDevelopmentApproveLogExample example);

    int deleteByExample(HardwareDevelopmentApproveLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HardwareDevelopmentApproveLog record);

    int insertSelective(HardwareDevelopmentApproveLog record);

    List<HardwareDevelopmentApproveLog> selectByExample(HardwareDevelopmentApproveLogExample example);

    HardwareDevelopmentApproveLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HardwareDevelopmentApproveLog record, @Param("example") HardwareDevelopmentApproveLogExample example);

    int updateByExample(@Param("record") HardwareDevelopmentApproveLog record, @Param("example") HardwareDevelopmentApproveLogExample example);

    int updateByPrimaryKeySelective(HardwareDevelopmentApproveLog record);

    int updateByPrimaryKey(HardwareDevelopmentApproveLog record);
}