package com.qianxu.course.entity;

import lombok.Data;

/**
 * @author 谦虚
 * @version 1.0
 * @date 2021/3/26 15:18
 * @describe 课程价格
 */
@Data
public class CoursePrice {
    Integer id;
    Integer courseId;
    Integer price;
}
