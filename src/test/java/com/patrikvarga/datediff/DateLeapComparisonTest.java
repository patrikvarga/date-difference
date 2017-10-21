package com.patrikvarga.datediff;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Leap-year related date comparison tests.
 *
 * @author patrik
 */
public class DateLeapComparisonTest {

    @Test
    public void oneMonth29Difference() {
        final Date date = new Date(2016, 2, 1);
        final Date datePlusOneMonth = new Date(2016, 3, 1);

        assertThat(datePlusOneMonth.compareTo(date), is(29));
        assertThat(date.compareTo(datePlusOneMonth), is(-29));
    }

    @Test
    public void oneYearDifference() {
        final Date date = new Date(2015, 10, 21);
        final Date datePlusOneYear = new Date(2016, 10, 21);

        assertThat(datePlusOneYear.compareTo(date), is(366));
        assertThat(date.compareTo(datePlusOneYear), is(-366));
    }

}
