package com.qxxg.springcloud.platformlog.config;

import ch.qos.logback.classic.pattern.MessageConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import org.apache.commons.lang.StringEscapeUtils;

/**
 * @Author: smallsand
 * @Date: 2019/12/24 15:37
 */
public class CustomMessageConverter extends MessageConverter {

    @Override
    public String convert(ILoggingEvent event) {
        return StringEscapeUtils.unescapeJava(event.getFormattedMessage()).replaceAll("\r|\n|\r\n", "").replaceAll("\"","'");
    }
}
