package com.patrikvarga.datediff;

import java.io.Console;

/**
 * Console application using stdin and stdout to calculate date difference.
 *
 * @author patrik
 */
public class DateDifferenceApp {

    public static void main(String[] args) {
        final Console console = System.console();
        final String input = console.readLine();

        final String[] dateStrings = input.split(", ");
        final Date date1 = Date.valueOf(dateStrings[0]);
        final Date date2 = Date.valueOf(dateStrings[1]);
        final Date earliestDate;
        final Date latestDate;

        final int diffInDays = date2.compareTo(date1);
        if (diffInDays >= 0) {
            earliestDate = date1;
            latestDate = date2;
        } else {
            earliestDate = date2;
            latestDate = date1;
        }

        final String output = String.format("%s, %s, %s\n",
                earliestDate.asString(), latestDate.asString(), Math.abs(diffInDays));
        console.printf(output);
    }

}
