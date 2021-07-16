package com.study.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author dongchang.xu
 * @date 2021/7/14 9:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {

    private Integer code;

    private String message;

    private T data;

    public Result(Integer code, String message) {
        this(code, message, null);
    }


}
