package ru.netology.services;

public class StatsService {
    public int sumAllSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSales (long[] sales) {
        int average = sumAllSales(sales) / sales.length;

        return average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month += 1;
        }
        return maxMonth + 1 ;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month += 1;
        }
        return minMonth + 1;
    }

    public int salesLowerAverage(long[] sales) {
        int lowerAverage = 0;
        for (long sale : sales) {
            if (sale < averageSales(sales)) {
                lowerAverage += 1;
            }
        }
        return lowerAverage;
    }

    public int salesAboveAverage(long[] sales) {
        int aboveAverage = 0;
        for (long sale : sales) {
            if (sale > averageSales(sales)) {
                aboveAverage += 1;
            }
        }
        return aboveAverage;
    }
}
