package org.example.service;

import com.alibaba.fastjson.JSON;
import org.example.config.MySource;
import org.example.pojo.Bill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;


@EnableBinding(MySource.class)
public class SendService {

    @Autowired
    private MySource mySource;

    public void sendBill(Bill bill) {
        String json = JSON.toJSONString(bill);
        // 获取相应地输出通道
        MessageChannel messageChannel =  mySource.billOutput();
        messageChannel.send(MessageBuilder.withPayload(json).build() );
    }

}
