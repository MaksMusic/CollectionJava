package Comparable.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * В данном примере создаются 4 компаратора, которые сортируют список автомобилей по разным критериям:
 * модели, году выпуска, мощности двигателя и комбинации года выпуска, модели и мощности двигателя.
 */

public class CarComparatorExample {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", 2018, 200));
        cars.add(new Car("Ford", 2020, 150));
        cars.add(new Car("BMW", 2015, 300));
        cars.add(new Car("Tesla", 2018, 400));
        cars.add(new Car("Audi", 2018, 250));

        // Сортировка по модели
        Comparator<Car> modelComparator = Comparator.comparing(Car::getModel);
        cars.sort(modelComparator);
        System.out.println("Сортировка по модели: " + cars);

        // Сортировка по году выпуска
        Comparator<Car> yearComparator = Comparator.comparingInt(Car::getYear);
        cars.sort(yearComparator);
        System.out.println("Сортировка по году выпуска: " + cars);

        // Сортировка по мощности двигателя
        Comparator<Car> lsComparator = Comparator.comparingInt(car -> car.getEngine().getLs());
        cars.sort(lsComparator);
        System.out.println("Сортировка по мощности двигателя: " + cars);

        // Сортировка по году выпуска, затем по модели, затем по мощности двигателя
        Comparator<Car> yearModelLsComparator =
                Comparator.comparingInt(Car::getYear)
                        .thenComparing(Car::getModel)
                        .thenComparing(car -> car.getEngine().getLs());
        cars.sort(yearModelLsComparator);
        System.out.println("Сортировка по году выпуска, модели и мощности двигателя: " + cars);
    }
}
