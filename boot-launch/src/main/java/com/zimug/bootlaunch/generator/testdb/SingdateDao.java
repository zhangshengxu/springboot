package com.zimug.bootlaunch.generator.testdb;

import com.zimug.bootlaunch.generator.testdb.Singdate;
import com.zimug.bootlaunch.generator.testdb.SingdateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SingdateDao {
    long countByExample(SingdateExample example);

    int deleteByExample(SingdateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Singdate record);

    int insertSelective(Singdate record);

    List<Singdate> selectByExample(SingdateExample example);

    Singdate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Singdate record, @Param("example") SingdateExample example);

    int updateByExample(@Param("record") Singdate record, @Param("example") SingdateExample example);

    int updateByPrimaryKeySelective(Singdate record);

    int updateByPrimaryKey(Singdate record);
}