package com.emcloud.ou.messaging;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface ProducerChannel {
    String CHANNEL = "messageChannel";
//这是输出
    @Output
    MessageChannel messageChannel();
}
