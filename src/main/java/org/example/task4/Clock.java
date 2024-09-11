package org.example.task4;

public class Clock implements Readable {
    private int hours;
    private int minutes;
    private int seconds;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void tick(){
        seconds = getSeconds() + 1;
        if (seconds >= 60){
            setSeconds(0);
            setMinutes(getMinutes() + 1);

            if (getMinutes() >= 60) {
            setMinutes(0);
            setHours(getHours() + 1);
        }
            if (hours >= 24) {
            setHours(0);}
        } else System.out.println("Error");

    }

    @Override
    public void readTime() {
        System.out.println("its: " + hours + ":" + minutes + ":" + seconds);
    }
}
