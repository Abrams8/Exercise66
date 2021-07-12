package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now().minus(60, ChronoUnit.DAYS);
        System.out.println(date);

        LocalDateTime dateTime = LocalDateTime.now().minus(60, ChronoUnit.DAYS);
        System.out.println(dateTime);
    }
}
