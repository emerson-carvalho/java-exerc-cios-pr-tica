package br.com.exercism.exercicios.geral;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Gigasecond {

    private LocalDateTime time;

    public Gigasecond(LocalDate moment) {
        this.time = moment.atTime(0,0,0);
    }

    public Gigasecond(LocalDateTime moment) {
        this.time = moment;
    }

    public LocalDateTime getDateTime() {
        return time.plusSeconds((int)Math.pow(10,9));
    }

    public static void main(String[] args) {

        Gigasecond gigaSecond = new Gigasecond(LocalDate.of(2011, Month.APRIL, 25));
        System.out.println(gigaSecond.getDateTime());
    }
}
