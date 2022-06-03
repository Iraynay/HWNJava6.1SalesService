import ru.netology.stats.SalesService;

public class Main {
    public static void main(String[] args) {
        SalesService service1 = new SalesService();
        int sum = (int) service1.sum(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        System.out.println("Сумма всех продаж: " + sum);

        SalesService service2 = new SalesService();
        long average = service2.average(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        System.out.println("Средняя сумма продаж в месяц: " + average);

        SalesService service3 = new SalesService();
        int peak = service3.maxi(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        System.out.println("Номер месяца, в котором был пик продаж: " + peak);

        SalesService service4 = new SalesService();
        int decline = service4.mini(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        System.out.println("Номер месяца, в котором был минимум продаж: " + decline);

        SalesService service5 = new SalesService();
        int underAverage = service5.underAverage(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        System.out.println("Кол-во месяцев, в которых продажи были ниже среднего: " + underAverage);

        SalesService service6 = new SalesService();
        int aboveAverage = service6.aboveAverage(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        System.out.println("Кол-во месяцев, в которых продажи были выше среднего: " + aboveAverage);
    }


}
