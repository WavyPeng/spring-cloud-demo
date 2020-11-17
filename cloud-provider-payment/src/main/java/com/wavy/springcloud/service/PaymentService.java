package com.wavy.springcloud.service;

import com.wavy.springcloud.entity.Payment;

/**
 * @Description
 * @Author pengweiwei
 * @Date 2020/11/17 11:30
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(Long id);
}
