package com.wavy.springcloud.service.impl;

import com.wavy.springcloud.dao.PaymentDao;
import com.wavy.springcloud.entity.Payment;
import com.wavy.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author pengweiwei
 * @Date 2020/11/17 11:30
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
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
