package ru.netology.stats;

public class SalesService {

    int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    //Сумма всех продаж
    public long sum(int[] monthlySales) {
        int sum = 0;
        for (int sales : monthlySales) {
            sum += sales;
        }
        return sum;
    }

    // Средняя сумма продаж в месяц
    public int average(int[] monthlySales) {
        int sum = 0;
        int average = 0;
        for (int sales : monthlySales) {
            sum += sales;
            average = sum / monthlySales.length;
        }
        return average;

    }

    //Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)*
    public int maxi(int[] monthlySales) {
        int maxi = 0;
        for (int i = 0; i < monthlySales.length; i++) {
            if (monthlySales[i] > monthlySales[maxi]) {
                maxi = i;
            }
        }
        return maxi;
    }

    //Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)*
    public int mini(int[] monthlySales) {
        int mini = 0;
        for (int i = 0; i < monthlySales.length; i++) {
            if (monthlySales[i] < monthlySales[mini]) {
                mini = i;
            }
        }
        return mini;
    }

    //Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
    public int underAverage(int[] monthlySales) {
        int average = 0;
        int sum = 0;
        for (int sales : monthlySales) {
            sum += sales;
            average = sum / monthlySales.length;
        }
        int underAverage = 0;
        for (int sales1 : monthlySales) {
            if (sales1 < average) {
                underAverage++;
            }
        }
        return underAverage;
    }

    //Кол-во месяцев, в которых продажи были выше среднего (см. п.2)
    public int aboveAverage(int[] monthlySales) {
        int average = 0;
        int sum = 0;
        for (int sales : monthlySales) {
            sum += sales;
            average = sum / monthlySales.length;
        }
        int aboveAverage = 0;
        for (int sales1 : monthlySales) {
            if (sales1 > average) {
                aboveAverage++;
            }
        }
        return aboveAverage;
    }
}



