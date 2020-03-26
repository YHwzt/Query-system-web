package com.yc.mapper;

import com.yc.beans.Virus;
import com.yc.beans.VirusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VirusMapper {
    int countByExample(VirusExample example);

    int deleteByExample(VirusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Virus record);

    int insertSelective(Virus record);

    List<Virus> selectByExample(VirusExample example);

    Virus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Virus record, @Param("example") VirusExample example);

    int updateByExample(@Param("record") Virus record, @Param("example") VirusExample example);

    int updateByPrimaryKeySelective(Virus record);

    int updateByPrimaryKey(Virus record);
}