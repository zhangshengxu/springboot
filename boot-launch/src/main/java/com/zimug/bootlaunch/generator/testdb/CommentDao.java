package com.zimug.bootlaunch.generator.testdb;

import com.zimug.bootlaunch.generator.testdb.Comment;
import com.zimug.bootlaunch.generator.testdb.CommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentDao {
    long countByExample(CommentExample example);

    int deleteByExample(CommentExample example);

    int deleteByPrimaryKey(Integer cmid);

    int insert(Comment record);

    int insertSelective(Comment record);

    List<Comment> selectByExample(CommentExample example);

    Comment selectByPrimaryKey(Integer cmid);

    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);
}