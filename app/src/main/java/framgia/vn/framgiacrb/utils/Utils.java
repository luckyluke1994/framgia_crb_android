package framgia.vn.framgiacrb.utils;

import android.content.Context;
import android.support.v4.content.ContextCompat;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by lethuy on 19/07/2016.
 */
public class Utils {
    public static final String ERROR_JSON = "errors";

    public static String formatTime(int hourOfDay, int minutes) {
        String formatHour, formatMinute;
        formatHour = (hourOfDay >= 10) ? String.valueOf(hourOfDay) : "0" + String.valueOf(hourOfDay);
//        if (hourOfDay >= 10) {
//            formatHour = String.valueOf(hourOfDay);
//        } else {
//            formatHour = "0" + String.valueOf(hourOfDay);
//        }
        formatMinute = (minutes >= 10) ? String.valueOf(minutes) : "0" + String.valueOf(minutes);
//        if (minutes >= 10) {
//            formatMinute = String.valueOf(minutes);
//        } else {
//            formatMinute = "0" + String.valueOf(minutes);
//        }
        return formatHour + ":" + formatMinute + " ";
    }

    public static String formatDate(int dayOfMonth, int monthOfYear, int year) {
        String formatDay, formatMonth;
        if (dayOfMonth >= 10) {
            formatDay = String.valueOf(dayOfMonth);
        } else {
            formatDay = "0" + String.valueOf(dayOfMonth);
        }
        if (monthOfYear >= 10) {
            formatMonth = String.valueOf(monthOfYear);
        } else {
            formatMonth = "0" + String.valueOf(monthOfYear);
        }
        return formatDay + "-" + formatMonth + "-" + year;
    }

    public static String getStringFromJson(String stringJson) throws JSONException {
        JSONObject errorJson = new JSONObject(stringJson);
        return errorJson.getString(ERROR_JSON);
    }

    public static int getColor(Context context, int colorId) {
        return ContextCompat.getColor(context, colorId);
    }

    public static boolean isBeforeHourInDate(Date date, Date compareDate){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar1.setTime(date);
        calendar2.setTime(compareDate);
        return calendar1.getTimeInMillis() < calendar2.getTimeInMillis();
    }
}
