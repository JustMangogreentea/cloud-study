package com.study.springcloud.dao;

import com.study.common.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author dongchang.xu
 * @date 2021/7/14 9:55
 */
@Mapper
public interface PaymentDao {


    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);


}
