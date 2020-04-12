package mh.springframework.springdevops.services.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * Created by mh on 12/04/2020.
 */
@Component
public class JmsTextMessageListener {

    @JmsListener(destination = "text.messagequeue")
    public void onMessage(String msg) {
        System.out.println("#### " + msg + " ###");
    }
}
