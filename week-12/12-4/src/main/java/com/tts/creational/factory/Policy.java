package com.tts.creational.factory;

public abstract class Policy {

    private String date;
    private String duration;
    private String rate;

    public Policy(String date, String duration, String rate) {
        this.date = date;
        this.duration = duration;
        this.rate = rate;
    }

    public abstract void renew();

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "date='" + date + '\'' +
                ", duration='" + duration + '\'' +
                ", rate='" + rate + '\'' +
                '}';
    }
}
