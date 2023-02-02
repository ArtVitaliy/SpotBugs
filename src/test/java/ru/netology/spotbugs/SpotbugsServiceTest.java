package ru.netology.spotbugs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpotbugsServiceTest {
    @Test
    void findMax() {
        SpotbugsService service = new SpotbugsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxIf() {
        SpotbugsService service = new SpotbugsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 14};
        long expected = 14;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

}
