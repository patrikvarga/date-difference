package com.patrikvarga.datediff;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * Naive immutable Gregorian date implementation.
 *
 * @author patrik
 */
public final class Date {

    private static final String SEPARATOR = " ";
    private static final List<Integer> DAYS_IN_MONTH = unmodifiableList(asList(
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    ));

    private final int year;
    private final int month;
    private final int day;

    public Date(final int year, final int month, final int day) {
        this.year = validateYear(year);
        this.month = validateMonth(month);
        this.day = validateDay(year, month, day);
    }

    /**
     * Get a string representation in the format of "DD MM YYYY" as per requirements.
     *
     * @return date in "DD MM YYYY" format
     */
    public String asString() {
        return day + SEPARATOR + month + SEPARATOR + year;
    }

    @Override
    public String toString() {
        return "Date{" + "year=" + year + ", month=" + month + ", day=" + day + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.year;
        hash = 53 * hash + this.month;
        hash = 53 * hash + this.day;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Date other = (Date) obj;
        if (this.year != other.year) {
            return false;
        }
        if (this.month != other.month) {
            return false;
        }
        if (this.day != other.day) {
            return false;
        }
        return true;
    }

    // validate methods do the actual year/month/day validation
    private static int validateYear(final int year) {
        if (year < 1) {
            throw new IllegalArgumentException("Invalid year: " + year);
        }
        return year;
    }

    private static int validateMonth(final int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month: " + month);
        }
        return month;
    }

    private static int validateDay(final int year, final int month, final int day) {
        int daysInMonth = DAYS_IN_MONTH.get(month - 1);
        if (isLeapYear(year)) {
            daysInMonth++;
        }
        if (day < 1 || day > daysInMonth) {
            throw new IllegalArgumentException("Invalid day: " + day);
        }
        return day;
    }

    private static boolean isLeapYear(final int year) {
        return year % 4 == 0;
    }

}
