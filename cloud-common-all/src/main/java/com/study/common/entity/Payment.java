package com.study.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author dongchang.xu
 * @date 2021/7/14 9:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {


    private Long id;
    
    private String serial;
}
