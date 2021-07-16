package com.study.springcloud.service;

import com.study.common.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author dongchang.xu
 * @date 2021/7/15 10:01
 */
public interface PaymentService {


    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
