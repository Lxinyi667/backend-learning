package top.lxyi.converter;

import top.lxyi.entity.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements Converter<String, Date> {
    //定义日期格式
    private final String PATTERN ="yyyy-MM-dd HH:mm:ss";

    @Override
    public Date convert(String source) {
        SimpleDateFormat sdf = new SimpleDateFormat(PATTERN);
        try {
            return sdf.parse(source);
        }catch (ParseException e){
            throw new IllegalArgumentException("无效的日期格式，请使用这种格式："+PATTERN);
        }
    }
    //
}
