package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {100, 5, 8, 4, 5, 3, 83, 6, 11, 11, 12};
        long expected = 100;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMaxNext(){
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 12 ,120 ,12};
        long expected = 120;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}