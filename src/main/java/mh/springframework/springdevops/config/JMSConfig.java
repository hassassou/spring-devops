package mh.springframework.springdevops.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;

/**
 * Created by mh on 12/04/2020.
 */
@Configuration
public class JMSConfig {

    public static final String textMsgQueue = "text.messagequeue";

    @Bean
    public Queue textMessageQueue() {
        return new ActiveMQQueue(textMsgQueue);
    }
}
