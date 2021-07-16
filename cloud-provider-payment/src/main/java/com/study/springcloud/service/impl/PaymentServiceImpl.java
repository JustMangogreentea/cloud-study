package com.study.springcloud.service.impl;

import com.study.springcloud.dao.PaymentDao;
import com.study.common.entity.Payment;
import com.study.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author dongchang.xu
 * @date 2021/7/15 10:01
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
