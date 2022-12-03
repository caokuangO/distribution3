package org.example.control;

import org.example.pojo.Bill;
import org.example.service.SendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class MqController {
    @Autowired
    private SendService sendService;

    @GetMapping("/sendBill")
    public void sendBill() {
        Bill bill = Bill.builder()
                .money(2.345)
                .remark("消费")
                .build();
        sendService.sendBill(bill);
    }

}
