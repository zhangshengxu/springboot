package com.zimug.bootlaunch.generator.testdb;

import com.zimug.bootlaunch.generator.testdb.Commentmiddle;
import com.zimug.bootlaunch.generator.testdb.CommentmiddleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentmiddleDao {
    long countByExample(CommentmiddleExample example);

    int deleteByExample(CommentmiddleExample example);

    int insert(Commentmiddle record);

    int insertSelective(Commentmiddle record);

    List<Commentmiddle> selectByExample(CommentmiddleExample example);

    int updateByExampleSelective(@Param("record") Commentmiddle record, @Param("example") CommentmiddleExample example);

    int updateByExample(@Param("record") Commentmiddle record, @Param("example") CommentmiddleExample example);
}