package com.qianxu.course.service;

import com.qianxu.course.entity.CourseAndPrice;
import com.qianxu.course.entity.CoursePrice;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 谦虚
 * @version 1.0
 * @date 2021/3/26 15:17
 * @describe 课程价格服务
 */
public interface CoursePriceService {
    /**
     * 获取课程价格
     * @param courseId 课程ID
     * @return 课程价格实例
     */
    CoursePrice getCoursePrice(Integer courseId);

    /**
     * 获取课程信息与价格
     * @return 课程信息与价格列表
     */
    public List<CourseAndPrice> getCourseAndPriceList();
}
