package org.example.zrk.controller;


import lombok.extern.slf4j.Slf4j;
import org.example.zrk.service.OrderMessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 订单控制器
 * @author: 姚广星
 * @time: 2020/11/29 12:03
 */
@RestController
@Slf4j
public class OrderController{

@Autowired
private OrderMessageProducer orderMessageProducer;

/**
 * 发送保存订单消息
 *
 * @param message
 */
@GetMapping(value = "sendSaveOrderMessage")
public void sendSaveOrderMessage() {
        //发送消息
        orderMessageProducer.sendMsg("aabbccdd");
        log.info("发送保存订单消息成功");
        }
}
