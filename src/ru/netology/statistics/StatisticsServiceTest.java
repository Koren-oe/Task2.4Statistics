package ru.netology.statistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {
    @Test
    void calculateSum() {
        StatisticsService service = new StatisticsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.calculateSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void calculateAverage() {
        StatisticsService service = new StatisticsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.calculateAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void calculateMaxSalesMonth() {
        StatisticsService service = new StatisticsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.calculateMaxSalesMonth(sales);

        assertEquals(expected, actual);
    }

    @Test
    void calculateMinSalesMonth() {
        StatisticsService service = new StatisticsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.calculateMinSalesMonth(sales);

        assertEquals(expected, actual);
    }

    @Test
    void calculateSalesMinAverage() {
        StatisticsService service = new StatisticsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.calculateSalesMinAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void calculateSalesMaxAverage() {
        StatisticsService service = new StatisticsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.calculateSalesMaxAverage(sales);

        assertEquals(expected, actual);
    }

}