package com.patrikvarga.datediff;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Date comparison tests.
 *
 * @author patrik
 */
public class DateComparisonTest {

    @Test
    public void oneDayDifference() {
        final Date date = new Date(2017, 10, 21);
        final Date datePlusOneDay = new Date(2017, 10, 22);

        assertThat(datePlusOneDay.compareTo(date), is(1));
        assertThat(date.compareTo(datePlusOneDay), is(-1));
    }

    @Test
    public void oneDayDifferenceAcrossMonths() {
        final Date date = new Date(2017, 10, 31);
        final Date datePlusOneDay = new Date(2017, 11, 1);

        assertThat(datePlusOneDay.compareTo(date), is(1));
        assertThat(date.compareTo(datePlusOneDay), is(-1));
    }

    @Test
    public void oneDayDifferenceAcrossYears() {
        final Date date = new Date(2017, 12, 31);
        final Date datePlusOneDay = new Date(2018, 1, 1);

        assertThat(datePlusOneDay.compareTo(date), is(1));
        assertThat(date.compareTo(datePlusOneDay), is(-1));
    }

    @Test
    public void oneWeekDifference() {
        final Date date = new Date(2017, 10, 21);
        final Date datePlusOneWeek = new Date(2017, 10, 28);

        assertThat(datePlusOneWeek.compareTo(date), is(7));
        assertThat(date.compareTo(datePlusOneWeek), is(-7));
    }

    @Test
    public void oneMonth31Difference() {
        final Date date = new Date(2017, 10, 1);
        final Date datePlusOneMonth = new Date(2017, 11, 1);

        assertThat(datePlusOneMonth.compareTo(date), is(31));
        assertThat(date.compareTo(datePlusOneMonth), is(-31));
    }

    @Test
    public void oneMonth30Difference() {
        final Date date = new Date(2017, 11, 1);
        final Date datePlusOneMonth = new Date(2017, 12, 1);

        assertThat(datePlusOneMonth.compareTo(date), is(30));
        assertThat(date.compareTo(datePlusOneMonth), is(-30));
    }

    @Test
    public void oneMonth28Difference() {
        final Date date = new Date(2017, 2, 1);
        final Date datePlusOneMonth = new Date(2017, 3, 1);

        assertThat(datePlusOneMonth.compareTo(date), is(28));
        assertThat(date.compareTo(datePlusOneMonth), is(-28));
    }

    @Test
    public void oneYearDifference() {
        final Date date = new Date(2017, 10, 21);
        final Date datePlusOneYear = new Date(2018, 10, 21);

        assertThat(datePlusOneYear.compareTo(date), is(365));
        assertThat(date.compareTo(datePlusOneYear), is(-365));
    }

}
