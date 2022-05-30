import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.SalesService;

public class SalesServiceTest {

    @Test

    public void ShouldCalcSumOfMonthlySales() {

        SalesService service1 = new SalesService();
        long actual1 = service1.sum();
        long expected1 = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        Assertions.assertEquals(actual1, expected1);
    }

    @Test

    public void ShouldFindAverageOfMonthlySales() {
        SalesService service2 = new SalesService();
        long actual2 = service2.average();
        long expected2 = 15;
        Assertions.assertEquals(actual2, expected2);
    }

    @Test
    public void ShouldFindPeakOfSales() {
        SalesService service3 = new SalesService();
        int actual3 = service3.maxi();
        int expected3 = 5;
        Assertions.assertEquals(actual3, expected3);
    }

    @Test
    public void ShouldFindDeclineOfSales() {
        SalesService service4 = new SalesService();
        int actual4 = service4.mini();
        int expected4 = 8;
        Assertions.assertEquals(actual4, expected4);
    }

    @Test
    public void ShouldFindUnderAverageMonths() {
        SalesService service5 = new SalesService();
        int actual5 = service5.underAverage();
        int expected5 = 5;
        Assertions.assertEquals(actual5, expected5);
    }

    @Test
    public void ShouldFindAboveAverageMonths() {
        SalesService service6 = new SalesService();
        int actual6 = service6.aboveAverage();
        int expected6 = 5;
        Assertions.assertEquals(actual6, expected6);
    }

}