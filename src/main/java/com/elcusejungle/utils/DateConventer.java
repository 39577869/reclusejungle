package com.elcusejungle.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConventer implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        if (s==null||s=="")
            return null;
        Date date = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            date = sdf.parse(s);
        }catch (Exception e){
            e.printStackTrace();
        }

        return date;
    }


}
