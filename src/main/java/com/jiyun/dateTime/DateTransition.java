package com.jiyun.dateTime;

import org.apache.commons.lang3.time.DateUtils;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.util.Date;

public class DateTransition implements Converter<String, Date> {

    @Override
    public Date convert(String s) {
        String[] date={"yyyy-MM-dd","yyyy/MM/dd"};
        Date date1=null;
        try {
             date1 = DateUtils.parseDate(s, date);
              return date1;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
