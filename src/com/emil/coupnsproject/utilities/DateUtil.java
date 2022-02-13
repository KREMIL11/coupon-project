package com.emil.coupnsproject.utilities;
import java.time.LocalDate;
import java.util.Calendar;

public class DateUtil {

    private final static String dateRegex = "[/]|[-]|[.]|[ ]";

    public static boolean isDatePassed (String date) {
        int year = Integer.parseInt(date.split(dateRegex)[2]);
        int month = Integer.parseInt(date.split(dateRegex)[1]);
        int day = Integer.parseInt(date.split(dateRegex)[0]);

        Calendar now = Calendar.getInstance();

        int currentYear = now.get(Calendar.YEAR);
        int currentMonth = now.get(Calendar.MONTH) + 1;
        int currentDay = now.get(Calendar.DAY_OF_MONTH);

        LocalDate currentDate = LocalDate.of(currentYear, currentMonth, currentDay);
        LocalDate EndDate = LocalDate.of(year, month, day);

        return currentDate.isAfter(EndDate);
    }

    public static String getCurrentDate() {
        Calendar now = Calendar.getInstance();

        int currentYear = now.get(Calendar.YEAR);
        int currentMonth = now.get(Calendar.MONTH) + 1;
        int currentDay = now.get(Calendar.DAY_OF_MONTH);

        LocalDate currentDate = LocalDate.of(currentYear, currentMonth, currentDay);

        return currentDate.toString();

    }
}