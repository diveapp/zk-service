package com.happy.home.zk.service.vo;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author: lijixiao
 * @date: 2020-07-28
 */
@Data
@Accessors(chain = true)
public class UserVO {

    private Integer id;

    private String name;

    private Integer age;
}
