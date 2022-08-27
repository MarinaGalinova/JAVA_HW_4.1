import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*; //чтобы не вызывать assertions в assert

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")
    void shouldCalculateForRegisteredAndUnderLimit(int expected, int amount, boolean registered) {
        BonusService service = new BonusService();

        // подготавливаем данные:
//        long amount = 1000;
//        boolean registered = true;
//        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}
//    @ParameterizedTest
//    @CsvFileSource (files = "src/test/resources/data.csv")
//
//    void shouldCalculateForRegisteredAndOverLimit() {
//        BonusService service = new BonusService();
//
//        // подготавливаем данные:
////        long amount = 1_000_000;
////        boolean registered = true;
////        long expected = 500;
//
//        // вызываем целевой метод:
//        long actual = service.calculate(amount, registered);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        assertEquals(expected, actual);
//    }
//
//    @ParameterizedTest
//    @CsvFileSource (files = "src/test/resources/data.csv")
//    void shouldCalculateForUnregisteredAndUnderLimit() {
//        BonusService service = new BonusService();
//
//        // подготавливаем данные:
////        long amount = 1000;
////        boolean registered = false;
////        long expected = 10;
//
//        // вызываем целевой метод:
//        long actual = service.calculate(amount, registered);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        assertEquals(expected, actual);
//    }
//
//    @ParameterizedTest
//    @CsvFileSource (files = "src/test/resources/data.csv")
//
//    void shouldCalculateForUnregisteredAndOverLimit() {
//        BonusService service = new BonusService();
//
//        // подготавливаем данные:
////        long amount = 1_000_000;
////        boolean registered = false;
////        long expected = 500;
//
//        // вызываем целевой метод:
//        long actual = service.calculate(amount, registered);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        assertEquals(expected, actual);
//    }

