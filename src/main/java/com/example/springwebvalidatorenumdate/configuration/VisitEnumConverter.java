package com.example.springwebvalidatorenumdate.configuration;

import com.example.springwebvalidatorenumdate.model.VisitEnum;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class VisitEnumConverter implements Converter<String, VisitEnum> {

    @Override
    public VisitEnum convert(String value) {
        return VisitEnum.valueOf(value.toUpperCase());
    }
}