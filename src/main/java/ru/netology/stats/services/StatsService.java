package ru.netology.stats.services;

public class StatsService {

    public int salesSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }


    public int averageSale(int[] sales) {

        return salesSum(sales) / sales.length;
    }


    public int maxSaleNum(int[] sales) {
        int maxNum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxNum]) {
                maxNum = i;
            }
        }
        return maxNum;
    }

    public int minSaleNum(int[] sales) {
        int minNum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minNum]) {
                minNum = i;
            }
        }
        return minNum;

    }

    public int belowAverageCount(int[] sales) {
        int a = averageSale(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale < a) {
                count++;
            }
        }
        return count;
    }

    public int aboveAverageCount(int[] sales) {
        int a = averageSale(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale > a) {
                count++;
            }
        }
        return count;
    }
}
