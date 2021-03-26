package com.qianxu.course.client;

import com.qianxu.entity.Course;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author 谦虚
 * @version 1.0
 * @date 2021/3/26 17:12
 * @describe
 */

/**
 * @FeignClient("course-list")需要跟对应的服务提供方spring.application.name相同
 */
@FeignClient(value = "course-list", fallback = CourseListClientHystrix.class)
@Primary
public interface CourseListClient {
    /**
     * 获取课程列表
     * @return 课程列表
     * @GetMapping({"/courses"})链接需要跟对应的controller下的方法相同
     */
    @GetMapping({"/courses"})
    List<Course> courseList();
}
