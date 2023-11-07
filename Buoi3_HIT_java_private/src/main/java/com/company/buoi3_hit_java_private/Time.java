/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.buoi3_hit_java_private;

/**
 *
 * @author 84393
 */
public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time() {
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void nextSecond() {
        this.second += 1;
        if (this.second >= 59 && this.minute >= 59) {
            this.second=0;
            this.minute=1;
            this.hour += 1;
        }
        if (this.second >= 59) {
            this.second=0;
            this.minute += 1;
        }
    }

    public void previousSecond() {
        this.second-=1;
        if (this.second <= 0) {
            this.second = 59;
            this.minute-=1;
        }
        if (this.second <= 0 && this.minute == 0) {
            this.hour -= 1;
            this.minute
        }
    }

    @Override
    public String toString() {
        return "Time{" + "hour=" + hour + ", minute=" + minute + ", second=" + second + '}';
    }

}
