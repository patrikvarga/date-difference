package com.patrikvarga.datediff;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Basic tests for Object methods etc.
 *
 * @author patrik
 */
public class DateObjectTest {

    private final Date date = new Date(2017, 10, 21);
    private final Date sameDate = new Date(2017, 10, 21);

    @Test
    public void identity() {
        assertThat(date, is(date));
    }

    @Test
    public void equality() {
        assertThat(date, is(sameDate));
    }

    @Test
    public void formatAsString() {
        assertThat(date.asString(), is("21 10 2017"));
    }

    @Test
    public void formatAsStringWithOneDigitDay() {
        assertThat(new Date(2017, 10, 1).asString(), is("01 10 2017"));
    }

    @Test
    public void formatAsStringWithOneDigitMonth() {
        assertThat(new Date(2017, 1, 21).asString(), is("21 01 2017"));
    }

    @Test
    public void formatAsStringWithOneDigitYear() {
        assertThat(new Date(7, 10, 21).asString(), is("21 10 0007"));
    }

}
