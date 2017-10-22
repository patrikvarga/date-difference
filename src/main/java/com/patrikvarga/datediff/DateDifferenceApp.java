package com.patrikvarga.datediff;

import java.io.Console;

/**
 * Console application using stdin and stdout to calculate date difference.
 *
 * Exit codes: 0 on success, 1 on illegal date format or values.
 *
 * @author patrik
 */
public class DateDifferenceApp {

    private static final String INPUT_DATES_SEPARATOR = ", ";

    public static void main(String[] args) {
        final Console console = System.console();
        final String input = console.readLine();

        final Date date1;
        final Date date2;
        try {
            final String[] dateStrings = input.split(INPUT_DATES_SEPARATOR);
            if (dateStrings.length != 2) {
                throw new IllegalArgumentException("Two input dates need to be specified, separated by ', '\n");
            }
            date1 = Date.valueOf(dateStrings[0]);
            date2 = Date.valueOf(dateStrings[1]);
        } catch (IllegalArgumentException illegalFormat) {
            console.printf("Error: " + illegalFormat.getMessage() + "\n");
            System.exit(1);
            return; // to avoid variable assignment warnings
        }

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
