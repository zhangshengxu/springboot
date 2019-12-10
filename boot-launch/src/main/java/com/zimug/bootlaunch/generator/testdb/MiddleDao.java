package com.zimug.bootlaunch.generator.testdb;

import com.zimug.bootlaunch.generator.testdb.Middle;
import com.zimug.bootlaunch.generator.testdb.MiddleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiddleDao {
    long countByExample(MiddleExample example);

    int deleteByExample(MiddleExample example);

    int insert(Middle record);

    int insertSelective(Middle record);

    List<Middle> selectByExample(MiddleExample example);

    int updateByExampleSelective(@Param("record") Middle record, @Param("example") MiddleExample example);

    int updateByExample(@Param("record") Middle record, @Param("example") MiddleExample example);
}