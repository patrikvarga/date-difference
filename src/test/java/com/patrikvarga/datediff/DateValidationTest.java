package com.patrikvarga.datediff;

import org.junit.Test;

/**
 * Validation tests.
 *
 * @author patrik
 */
@SuppressWarnings("ResultOfObjectAllocationIgnored")
public class DateValidationTest {

    @Test(expected = IllegalArgumentException.class)
    public void invalidNegativeYear() {
        new Date(-1, 1, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidZeroYear() {
        new Date(0, 1, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidNegativeMonth() {
        new Date(2017, -1, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidZeroMonth() {
        new Date(2017, 0, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidMonth() {
        new Date(2017, 13, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidNegativeDay() {
        new Date(2017, 10, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidDay0() {
        new Date(2017, 10, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidDay29() {
        new Date(2017, 2, 29);
    }

    public void validDay29() {
        new Date(2016, 2, 29);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidDay30() {
        new Date(2017, 2, 30);
    }

    public void validDay30() {
        new Date(2017, 10, 30);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidDay31() {
        new Date(2017, 11, 31);
    }

    public void validDay31() {
        new Date(2017, 10, 31);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidDay32() {
        new Date(2017, 10, 32);
    }

}
