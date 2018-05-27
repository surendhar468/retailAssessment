/**
 * 
 */
package com.assessment.retail.util;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * @author
 * 
 */
public class Utils {

  /**
   * 
   * @param date
   * @return
   */
  public static Calendar getCalendar(Date date) {
    Calendar cal = Calendar.getInstance(Locale.US);
    cal.setTime(date);
    return cal;
  }
}
