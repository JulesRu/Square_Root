package ru.netology.sqr.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/numbers.csv")
    public void testNumbersInTheRange(int expected, int min, int max) {
        SQRService service = new SQRService();

        int result = service.calcNumbers(min, max);

        Assertions.assertEquals(expected, result);
    }

}
