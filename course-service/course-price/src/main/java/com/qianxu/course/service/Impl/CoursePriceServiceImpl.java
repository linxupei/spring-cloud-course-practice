package com.qianxu.course.service.Impl;

import com.qianxu.course.client.CourseListClient;
import com.qianxu.course.dao.CoursePriceMapper;
import com.qianxu.course.entity.CourseAndPrice;
import com.qianxu.course.entity.CoursePrice;
import com.qianxu.course.service.CoursePriceService;
import com.qianxu.entity.Course;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 谦虚
 * @version 1.0
 * @date 2021/3/26 15:26
 * @describe
 */
@Service
@RequiredArgsConstructor
public class CoursePriceServiceImpl implements CoursePriceService {
    final CoursePriceMapper coursePriceMapper;
    final CourseListClient courseListClient;

    /**
     * 获取课程价格
     *
     * @param courseId 课程ID
     * @return 课程价格实例
     */
    @Override
    public CoursePrice getCoursePrice(Integer courseId) {
        return coursePriceMapper.findCoursePrice(courseId);
    }

    /**
     * 获取课程信息与价格
     *
     * @return 课程信息与价格列表
     */
    @Override
    public List<CourseAndPrice> getCourseAndPriceList() {
        List<Course> courseList = courseListClient.courseList();
        List<CourseAndPrice> courseAndPriceList = new ArrayList<>();
        for (Course course : courseList) {
            CourseAndPrice courseAndPrice = new CourseAndPrice();
            CoursePrice coursePrice = this.getCoursePrice(course.getCourseId());
            courseAndPrice.setId(course.getId());
            courseAndPrice.setCourseId(course.getCourseId());
            courseAndPrice.setName(course.getCourseName());
            courseAndPrice.setPrice(coursePrice.getPrice());
            courseAndPriceList.add(courseAndPrice);
        }
        return courseAndPriceList;
    }
}
