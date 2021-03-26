package com.qianxu.dao;

import com.qianxu.entity.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 谦虚
 * @version 1.0
 * @date 2021/3/25 23:08
 * @describe
 */
@Mapper
@Repository
public interface CourseMapper {
    /**
     * 从数据库获取上架的课程
     * @return 课程列表
     */
    @Select("SELECT * FROM course WHERE valid = 1")
    List<Course> findValidCourses();
}
