package org.example;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(new DateSorter().sortDates(List.of(LocalDate.of(2004, 7, 1),
                LocalDate.of(2005, 1, 2),
                LocalDate.of(2007, 1, 1),
                LocalDate.of(2032, 5, 3),
                LocalDate.of(2022, 10, 3),
                LocalDate.of(2010, 9, 3),
                LocalDate.of(2040, 8, 5))));
    }
}