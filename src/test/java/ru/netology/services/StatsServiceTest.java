package ru.netology.services;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldSumAllSales() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int actual = service.sumAllSales(sales);
        int expected = 180;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldAverageSales() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int actual = service.averageSales(sales);
        int expected = 15;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int actual = service.maxSales(sales);
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMinSales() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int actual = service.minSales(sales);
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindSalesLowerAverage() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int actual = service.salesLowerAverage(sales);
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindSalesAboveAverage() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int actual = service.salesAboveAverage(sales);
        int expected = 5;

        assertEquals(expected, actual);
    }
}
