/**
 * Copyright (c) 2015 Jumbomart All Rights Reserved.
 * 
 * This software is the confidential and proprietary information of Jumbomart. You shall not
 * disclose such Confidential Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Jumbo.
 * 
 * JUMBOMART MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE, EITHER
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE, OR NON-INFRINGEMENT. JUMBOMART SHALL NOT BE LIABLE FOR ANY
 * DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS
 * DERIVATIVES.
 * 
 */
package cn.greeston.utils;

import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;

/***
 * 日期工具类（日期的换算等）
 * @author Lay
 * @date 2017年9月6日 下午1:39:49
 * @since
 */
public final class DateUtil {

    /**
     * 得到某一天的开始时间，即为当天的00:00:00
     * @param date
     * @return
     * @Description:
     */
    public static Date getBeginOfDate(Date date){
        DateTime dateTime ;
        if (date == null){
            dateTime = new DateTime();
        }else{
            dateTime = new DateTime(date);
        }
        return dateTime.withTimeAtStartOfDay().toDate(); 
    }
    
    /**
     * 得到某一天的结束时间，即为当天的23:59:59 999
     * @param date
     * @return
     * @Description:
     */
    public static Date getEndOfDate(Date date){
        DateTime dateTime ;
        if (date == null){
            dateTime = new DateTime();
        }else{
            dateTime = new DateTime(date);
        }
        return dateTime.millisOfDay().withMaximumValue().toDate(); 
    }
    /***
     * 得到某一天向后多少天的日期
     * @author Lay
     * @param date
     * @param days
     * @return
     * @since
     */
    public static Date getDatePlusDays(Date date,int days){
        LocalDateTime dt = LocalDateTime.fromDateFields(date);
        LocalDateTime expiredDt = null;
        expiredDt = dt.plusDays(days);        
        return expiredDt.toDate();
    }
    /***
     *  得到某一天向前多少天的日期
     * @author Lay
     * @param date
     * @param days
     * @return
     * @since
     */
    public static Date getDateMinusDays(Date date,int days){
        LocalDateTime dt = LocalDateTime.fromDateFields(date);
        LocalDateTime expiredDt = dt.minusDays(days);        
        return expiredDt.toDate();
    }
    /**
     *  得到某一天向后多少小时的日期
     * @author Lay
     * @param date
     * @param hours
     * @return
     * @since
     */
    public static Date getDatePlusHours(Date date,int hours){
        LocalDateTime dt = LocalDateTime.fromDateFields(date);
        LocalDateTime expiredDt = null;
        expiredDt = dt.plusHours(hours);
        return expiredDt.toDate();
    }
    /***
     *  得到某一天向前多少小时的日期
     * @author Lay
     * @param date
     * @param hours
     * @return
     * @since
     */
    public static Date getDateMinusHours(Date date,int hours){
        LocalDateTime dt = LocalDateTime.fromDateFields(date);
        LocalDateTime expiredDt = null;
        expiredDt = dt.minusHours(hours);
        return expiredDt.toDate();
    }
    
    /**
     * 获取当前时间Date
     * 
     * @return
     */
    public static Date nowDate(){
        return new DateTime().toDate();
    }
    
    /**
     * 获取指定日期当天的时间段
     * @author Lay
     * @return
     * @since
     */
    public static Interval getDateInterval(Date date) {
        DateTime dt = LocalDate.fromDateFields(date).toDateTimeAtStartOfDay();
        return new Interval(dt, dt.plusDays(1));
    }

    /**
     * 获取指定日期当周的时间段
     * @author Lay
     * @return
     * @since
     */
    public static Interval getDateWeekInterval(Date date) {
        DateTime dt = LocalDate.fromDateFields(date).toDateTimeAtStartOfDay();
        DateTime start = dt.withDayOfWeek(DateTimeConstants.MONDAY);
        DateTime end = dt.withDayOfWeek(DateTimeConstants.SUNDAY).plusDays(1);
        return new Interval(start, end);
    }

    /**
     * 获取指定日期当月的时间段
     * @author Lay
     * @return
     * @since
     */
    public static Interval getDateMonthInterval(Date date) {
        DateTime dt = LocalDate.fromDateFields(date).toDateTimeAtStartOfDay();
        DateTime start = dt.withDayOfMonth(1);
        DateTime end = dt.plusMonths(1).withDayOfMonth(1);
        return new Interval(start, end);
    }
}
