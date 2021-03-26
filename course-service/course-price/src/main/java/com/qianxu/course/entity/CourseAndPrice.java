package com.qianxu.course.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 谦虚
 * @version 1.0
 * @date 2021/3/26 19:54
 * @describe
 */
@Data
public class CourseAndPrice implements Serializable {
    Integer id;
    Integer courseId;
    String name;
    Integer price;
}
