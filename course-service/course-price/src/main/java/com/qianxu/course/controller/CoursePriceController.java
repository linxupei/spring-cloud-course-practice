package com.qianxu.course.controller;

import com.qianxu.course.client.CourseListClient;
import com.qianxu.course.entity.CourseAndPrice;
import com.qianxu.course.entity.CoursePrice;
import com.qianxu.course.service.CoursePriceService;
import com.qianxu.entity.Course;
import lombok.RequiredArgsConstructor;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

/**
 * @author 谦虚
 * @version 1.0
 * @date 2021/3/26 15:13
 * @describe 课程价格控制器
 */
@RestController
@RequiredArgsConstructor
public class CoursePriceController {
    final CoursePriceService coursePriceService;
    final CourseListClient courseListClient;

    @GetMapping({"/price"})
    public Integer getCoursePrice(Integer courseId) {
        CoursePrice coursePrice = coursePriceService.getCoursePrice(courseId);
        Integer price = null;
        if (coursePrice != null) {
            price = coursePrice.getPrice();
        }
        return price;
    }

    @GetMapping({"/coursesInPrice"})
    public List<Course> getCourseListInPrice() {
        List<Course> courses = courseListClient.courseList();
        return courses;
    }

    @GetMapping({"/courseAndPrice"})
    public List<CourseAndPrice> getCourseAndPrice() {
        List<CourseAndPrice> courseAndPriceList = coursePriceService.getCourseAndPriceList();
        if (CollectionUtils.isEmpty(courseAndPriceList)) {
            return Collections.emptyList();
        }
        return courseAndPriceList;
    }
}
