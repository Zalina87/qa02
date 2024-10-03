package ru.netology.services;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountServiseTest {
    @ParameterizedTest
    @CsvSource({
            "100000,60000,150000,2",
            "10000,3000,20000,3"
    })
    public void testThreshold(long income, long expenses, long threshold, int actual) {
        CountService service = new CountService();
        int count = service.calculate(income, expenses, threshold);

        assertEquals(count, actual);
    }
}
