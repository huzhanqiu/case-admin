package com.hzq.nacos.caseadminauth.util;

/**
 * @Author: huzq
 * @Date: 2019-03-07/20:28
 * @Description: zhjd
 */

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.Months;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;

public class JodaTimeUtil {

    public static final String STANDARD_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static Date strToDate(String dateTimeStr, String formatStr) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(formatStr);
        DateTime dateTime = dateTimeFormatter.parseDateTime(dateTimeStr);
        return dateTime.toDate();
    }

    public static DateTime strToDateTime(String dateTimeStr, String formatStr) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(formatStr);
        DateTime dateTime = dateTimeFormatter.parseDateTime(dateTimeStr);
        return dateTime;
    }

    public static String dateToStr(Date date, String formatStr) {
        if (date == null) {
            return StringUtils.EMPTY;
        }
        DateTime dateTime = new DateTime(date);
        return dateTime.toString(formatStr);
    }

    public static Date strToDate(String dateTimeStr) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(STANDARD_FORMAT);
        DateTime dateTime = dateTimeFormatter.parseDateTime(dateTimeStr);
        return dateTime.toDate();
    }

    public static String dateToStr(Date date) {
        if (date == null) {
            return StringUtils.EMPTY;
        }
        DateTime dateTime = new DateTime(date);
        return dateTime.toString(STANDARD_FORMAT);
    }

    /**
     * 计算月份差
     *
     * @param dateBegin 较小的日期
     * @param dateEnd   较大的日期
     * @return
     */
    public static int getMonthDiff(Date dateBegin, Date dateEnd) {
        DateTime dateTimeBegin = new DateTime(dateBegin);
        DateTime dateTimeEnd = new DateTime(dateEnd);
        return Months.monthsBetween(dateTimeBegin, dateTimeEnd).getMonths();
    }

    public static void main(String[] args) {
        System.out.println(getMonthDiff(JodaTimeUtil.strToDate("2019-01-12", "yyyy-MM-dd"), JodaTimeUtil.strToDate("2019-04-01 12:00:00")));
       /* System.out.println(JodaTimeUtil.dateToStr(new Date(),"yyyy-MM-dd HH:mm:ss"));
        System.out.println(JodaTimeUtil.strToDate("1970-01-01 09:00:30","yyyy-MM-dd HH:mm:ss"));*/

    }

}
