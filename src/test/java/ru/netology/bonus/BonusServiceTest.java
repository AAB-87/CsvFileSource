package ru.netology.bonus;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BonusServiceTest {
    @ParameterizedTest // аннотация даёт возможность прогонять один и тот же тест с разными данными
    @CsvFileSource(resources = "/data.csv") // общепринятый «табличный» формат данных CSV, который позволяет указывать набор тестовых данных в отдельном файле

    void shouldCalculate(String testName, long amount, boolean registered, long expected) { // данные из Csv подставляются на вход метода
        BonusService service = new BonusService();
        long actual = service.calculate(amount, registered); // вызываем целевой метод

        assertEquals(expected, actual); // производим проверку (сравниваем ожидаемый и фактический)
    }
}