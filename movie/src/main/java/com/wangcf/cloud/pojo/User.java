package com.wangcf.cloud.pojo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author: wangcf
 * @Date: 2019/7/10 23:44
 * @Description ${description}
 */
@Data
public class User {
    private Long id;
    private String username;
    private String name;
    private Integer age;
    private BigDecimal balance;
}
