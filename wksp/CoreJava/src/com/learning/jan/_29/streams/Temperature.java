package com.learning.jan._29.streams;

import java.math.BigDecimal;
import java.util.Date;

public class Temperature {

    private Date date;

    private BigDecimal reading;

    public Temperature(Date date, BigDecimal reading) {
        this.date = date;
        this.reading = reading;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getReading() {
        return reading;
    }

    public void setReading(BigDecimal reading) {
        this.reading = reading;
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "date=" + date +
                ", reading=" + reading +
                '}';
    }
}

