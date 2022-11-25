package org.example;

import java.util.Comparator;

public class CompareByEngineCapacity implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        return Double.compare(car1.getEngineCapacity(), car2.getEngineCapacity());
    }
}
