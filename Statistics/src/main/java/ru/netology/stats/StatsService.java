package ru.netology.stats;

public class StatsService {
    public int calculateSum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            // аналог sum = sum + purchase;
            sum += sale;
        }
        return sum;
    }

    public long calculateAverage(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            // аналог sum = sum + purchase;
            sum += sale;
        }
        long averageSum = sum/sales.length;

        return averageSum;
    }

    public int calculateMinSalesMonth(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int calculateMaxSalesMonth(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public long calculateSalesMinAverage(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            // аналог sum = sum + purchase;
            sum += sale;
        }
        long averageSum = sum/sales.length;
        long sumMonth = 0;// переменная для подсчета колличества месяцев
        for (long sale : sales) {
            // sale - продажи в рассматриваемом месяце
            if (sale < averageSum) {
               sumMonth = sumMonth + 1;
            }
        }
        return sumMonth;
    }

    public long calculateSalesMaxAverage(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            // аналог sum = sum + purchase;
            sum += sale;
        }
        long averageSum = sum/sales.length;
        long sumMonth = 0;// переменная для подсчета колличества месяцев
        for (long sale : sales) {
            // sale - продажи в рассматриваемом месяце
            if (sale > averageSum) {
                sumMonth = sumMonth + 1;
            }
        }
        return sumMonth;
    }
}
