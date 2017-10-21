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

    final Date date = new Date(2017, 10, 21);
    final Date sameDate = new Date(2017, 10, 21);

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

}
