package org.example.zrk.bindings;


import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;
/**
 * @Description 订单消息输出通道处理器
 * @author: 姚广星
 * @time: 2020/11/29 15:37
 */
@Component
public interface OrderOutputChannelProcessor{

    String SAVE_ORDER_OUTPUT ="saveOrderOutput";

    @Output(SAVE_ORDER_OUTPUT)
    MessageChannel saveOrderOutput();


}
