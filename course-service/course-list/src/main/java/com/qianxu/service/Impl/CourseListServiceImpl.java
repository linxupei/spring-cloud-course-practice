package com.qianxu.service.Impl;

import com.qianxu.dao.CourseMapper;
import com.qianxu.entity.Course;
import com.qianxu.service.CourseListService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 谦虚
 * @version 1.0
 * @date 2021/3/25 23:03
 * @describe
 */
@Service
@RequiredArgsConstructor
public class CourseListServiceImpl implements CourseListService {
    final CourseMapper courseMapper;

    /**
     * 获取课程列表
     *
     * @return 课程列表
     */
    @Override
    public List<Course> getCourseList() {
        return courseMapper.findValidCourses();
    }
}
