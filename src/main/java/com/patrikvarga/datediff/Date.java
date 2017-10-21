package com.patrikvarga.datediff;

/**
 * Naive immutable Gregorian date implementation.
 *
 * @author patrik
 */
public final class Date {

    private static final String SEPARATOR = " ";

    private final int year;
    private final int month;
    private final int day;

    public Date(final int year, final int month, final int day) {
        this.year = year;
        this.month = month;
        this.day = day;
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

}
