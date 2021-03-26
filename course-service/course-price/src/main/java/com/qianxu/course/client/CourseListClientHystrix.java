package com.qianxu.course.client;

import com.qianxu.entity.Course;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 谦虚
 * @version 1.0
 * @date 2021/3/26 19:27
 * @describe 断路器实现类
 */
@Component
public class CourseListClientHystrix implements CourseListClient{
    /**
     * 获取课程列表
     *
     * @return 课程列表
     * @GetMapping({"/courses"})链接需要跟对应的controller下的方法相同
     */
    @Override
    public List<Course> courseList() {
        List<Course> defaultCourse = new ArrayList<>();
        Course course = new Course();
        course.setId(1);
        course.setCourseId(1);
        course.setCourseName("默认课程");
        course.setValid(1);
        defaultCourse.add(course);
        return defaultCourse;
    }
}
