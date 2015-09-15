package com.fred.demo;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * @author Fred Liu(liuxiaokun0410@gmail.com)
 * @version 1.7
 * @date 2015/9/15
 */
public class ConsumerMessageListener implements MessageListener {

//http://blog.csdn.net/haoxingfeng/article/details/9167895

    @Override
    public void onMessage(Message message) {

        TextMessage textMsg = (TextMessage) message;

        try {
            System.out.println("received content is £º" + textMsg.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }


}
