package com.ychulovskyy.examples.spring.value;

import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import java.io.IOException;
import java.util.Properties;

public class EncryptPropertyConfigurer extends PropertySourcesPlaceholderConfigurer {

    private final static String PREFIX = "ENC:";

    @Override
    protected String convertPropertyValue(String value) {
        return value.startsWith(PREFIX) ?
                EncryptUtils.encrypt(value.substring(PREFIX.length())) : value;
    }

    @Override
    protected void loadProperties(Properties props) throws IOException {
        super.loadProperties(props);
        for (String propertyName : props.stringPropertyNames()) {
            Object propertyValue = props.get(propertyName);
            if (propertyValue instanceof String && ((String) propertyValue).startsWith(PREFIX)) {
                props.setProperty(propertyName, EncryptUtils.encrypt(((String) propertyValue).substring(PREFIX.length())));
            }
        }
    }
}
