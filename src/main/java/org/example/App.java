package org.example;

import java.util.Iterator;
import java.util.TreeSet;

public class App
{
    public static void main( String[] args ) {
        Car car1 = new Car(1995, 2.1);
        Car car2 = new Car(1991, 3.8);
        Car car3 = new Car(1988, 2.8);
        Car car4 = new Car(1981, 2.6);
        Car car5 = new Car(1968, 3.5);
        Car car6 = new Car(1972, 4.2);
        Car car7 = new Car(1986, 3.2);

        TreeSet<Car> cars = new TreeSet<>(new CompareByYear());

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);

        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println();
        System.out.println("*****************************************************");
        System.out.println();

        cars = new TreeSet<>(new CompareByEngineCapacity());

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);

        Iterator<Car> iter = cars.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}