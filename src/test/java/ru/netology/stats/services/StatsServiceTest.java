package ru.netology.stats.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void testSalesSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.salesSum(sales);

        Assertions.assertEquals(expectedSum, actualSum);


    }

    @Test
    public void testAverageSale() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSale = 15;
        int actualSale = service.averageSale(sales);

        Assertions.assertEquals(expectedSale, actualSale);
    }

    @Test
    public void testMaxSale() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNum = 7;
        int actualNum = service.maxSaleNum(sales);

        Assertions.assertEquals(expectedNum, actualNum);
    }

    @Test
    public void testMinSale() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNum = 8;
        int actualNum = service.minSaleNum(sales);

        Assertions.assertEquals(expectedNum, actualNum);
    }

    @Test
    public void testBelowAverageCount() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.belowAverageCount(sales);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testAboveAverageCount() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.aboveAverageCount(sales);

        Assertions.assertEquals(expected, actual);
    }
}



