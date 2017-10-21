package com.patrikvarga.datediff;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Basic tests for Object methods etc.
 *
 * @author patrik
 */
public class DateParsingTest {

    @Test
    public void parseFromString() {
        assertThat(Date.valueOf("21 10 2017"), is(new Date(2017, 10, 21)));
    }

    @Test
    public void parseFromStringWithOneDigitDay() {
        assertThat(Date.valueOf("01 10 2017"), is(new Date(2017, 10, 1)));
    }

    @Test
    public void parseFromStringWithOneDigitMonth() {
        assertThat(Date.valueOf("21 01 2017"), is(new Date(2017, 1, 21)));
    }

    @Test
    public void parseFromStringWithOneDigitYear() {
        assertThat(Date.valueOf("21 10 0007"), is(new Date(7, 10, 21)));
    }

}
