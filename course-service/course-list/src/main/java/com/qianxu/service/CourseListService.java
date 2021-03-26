package com.qianxu.service;

import com.qianxu.entity.Course;

import java.util.List;

/**
 * @author 谦虚
 * @version 1.0
 * @date 2021/3/25 23:02
 * @describe 课程列表服务
 */
public interface CourseListService {
    /**
     * 获取课程列表
     * @return 课程列表
     */
    List<Course> getCourseList();
}
