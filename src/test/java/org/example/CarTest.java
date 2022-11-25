package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CarTest {

    private static Car car1, car2, car3;

    private static CompareByYear compareByYear;

    private static CompareByEngineCapacity compareByEngineCapacity;

    @BeforeAll
    static void createObjects() {
        car1 = new Car(1988, 2.8);
        car2 = new Car(1991, 3.8);
        car3 = new Car(1988, 2.8);

        compareByYear = new CompareByYear();

        compareByEngineCapacity = new CompareByEngineCapacity();
    }

    @Test
    void shouldCompareByEngineCapacityReturnPositive() {
        assertThat(compareByYear.compare(car2, car1)).isPositive();
    }

    @Test
    void shouldCompareByEngineCapacityReturnNegative() {
        assertThat(compareByYear.compare(car1, car2)).isNegative();
    }

    @Test
    void shouldCompareByEngineCapacityReturnZero() {
        assertThat(compareByYear.compare(car1, car3)).isZero();
    }

    @Test
    void shouldCompareByYearReturnPositive() {
        assertThat(compareByEngineCapacity.compare(car2, car3)).isPositive();
    }

    @Test
    void shouldCompareByYearReturnNegative() {
        assertThat(compareByEngineCapacity.compare(car3, car2)).isNegative();
    }

    @Test
    void shouldCompareByYearReturnZero() {
        assertThat(compareByEngineCapacity.compare(car1, car3)).isZero();
    }
}
