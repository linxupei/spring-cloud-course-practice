package com.qianxu.controller;

import com.qianxu.entity.Course;
import com.qianxu.service.CourseListService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 谦虚
 * @version 1.0
 * @date 2021/3/25 23:00
 * @describe 课程列表控制类
 */
@RestController
@RequiredArgsConstructor
public class CourseListController {
    final CourseListService courseListService;

    @GetMapping({"/courses"})
    public List<Course> courseList() {
        return courseListService.getCourseList();
    }
}
