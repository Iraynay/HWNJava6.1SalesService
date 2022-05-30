import ru.netology.stats.SalesService;

public class Main {
    public static void main(String[] args) {
        SalesService service1 = new SalesService();
        long sum = service1.sum();
        System.out.println("Сумма всех продаж: " + sum);

        SalesService service2 = new SalesService();
        long average = service2.average();
        System.out.println("Средняя сумма продаж в месяц: " + average);

        SalesService service3 = new SalesService();
        int peak = service3.maxi();
        System.out.println("Номер месяца, в котором был пик продаж: " + peak);

        SalesService service4 = new SalesService();
        int decline = service4.mini();
        System.out.println("Номер месяца, в котором был минимум продаж: " + decline);

        SalesService service5 = new SalesService();
        int underAverage = service5.underAverage();
        System.out.println("Кол-во месяцев, в которых продажи были ниже среднего: " + underAverage);

        SalesService service6 = new SalesService();
        int aboveAverage = service6.aboveAverage();
        System.out.println("Кол-во месяцев, в которых продажи были выше среднего: " + aboveAverage);
    }


}
