package com.study.springcloud.controller;

import com.study.common.entity.Payment;
import com.study.common.entity.Result;
import com.study.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author dongchang.xu
 * @date 2021/7/15 10:05
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping("/create")
    public Result create(Payment payment) {
        int result = paymentService.create(payment);
        log.info("***插入结果：" + result);
        return new Result(200, "success", result);
    }


    @GetMapping("/getPaymentById/{id}")
    public Result getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("***查询结果：" + payment);
        return new Result(200, "success", payment);
    }
}
