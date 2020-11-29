package com.wavy.springcloud.controller;

import com.wavy.springcloud.entity.CommonResult;
import com.wavy.springcloud.entity.Payment;
import com.wavy.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description
 * @Author pengweiwei
 * @Date 2020/11/17 11:32
 */
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping(value = "/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        return result > 0 ? new CommonResult(200, "success", result) :
                new CommonResult(444, "failed", result);
    }

    @GetMapping("/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        return new CommonResult(200, "success", paymentService.getPaymentById(id));
    }
}
