package org.example;

import java.util.Comparator;

public class CompareByYear implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        return Integer.compare(car1.getYearOfManufacture(), car2.getYearOfManufacture());
    }
}
