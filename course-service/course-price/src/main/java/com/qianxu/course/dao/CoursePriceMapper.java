package com.qianxu.course.dao;

import com.qianxu.course.entity.CoursePrice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author 谦虚
 * @version 1.0
 * @date 2021/3/26 15:20
 * @describe 课程价格Mapper类
 */
@Mapper
@Repository
public interface CoursePriceMapper {
    /**
     * 根据课程ID查询课程价格
     * @param courseId 课程ID
     * @return 课程价格实例
     */
    @Select("SELECT * FROM course_price WHERE course_id = #{courseId}")
    CoursePrice findCoursePrice(Integer courseId);
}
