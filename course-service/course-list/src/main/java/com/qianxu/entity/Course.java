package com.qianxu.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 谦虚
 * @version 1.0
 * @date 2021/3/25 22:58
 * @describe Course实体类
 */
@Data
public class Course implements Serializable {
    Integer id;
    Integer courseId;
    String courseName;
    Integer valid;
}
