package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/sqr.csv")
    public void testSqrIn(int expected, int rangeStart, int rangeEnd) {
        SQRService service = new SQRService();

        int actual = service.calcSqr(rangeStart, rangeEnd);

        Assertions.assertEquals(expected, actual);
    }


}
