package com.platform.cloud.sso.config;

import ch.qos.logback.classic.pattern.MessageConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

/**
 * @Author: smallsand
 * @Date: 2019/12/24 15:37
 */
public class CustomMessageConverter extends MessageConverter {

    @Override
    public String convert(ILoggingEvent event) {
        String log =  event.getFormattedMessage();
        log = log.replaceAll("\n","").replaceAll("\"","'");
        return log;
    }
}
