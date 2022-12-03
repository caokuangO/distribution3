package org.example.config;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * 生产者通道，即Stream模型中的输出通道
 */
public interface MySource {



    /**
     * 主题 topic.bill 的输出通道，名为 billOutput
     */
    String billOutput = "billOutput";


    @Output(billOutput)
    MessageChannel billOutput();

}
