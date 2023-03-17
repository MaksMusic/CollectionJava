package Comparable.comparator;

import java.util.ArrayList;
import java.util.Collections;
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
        cars.add(new Car("Audi", 2019, 220));
        cars.add(new Car("Audi", 2018, 355));

        /** Сортировка по модели */
        Comparator<Car> modelComparator = Comparator.comparing(Car::getModel);
        cars.sort(modelComparator);
        System.out.println("Сортировка по модели: " + cars);

//        or без использования лямбда-выражения:
//        Comparator<Car> modelComparator = new Comparator<Car>() {
//            public int compare(Car car1, Car car2) {
//                return car1.getModel().compareTo(car2.getModel());
//            }
//        };
//
//        Collections.sort(cars, modelComparator); // сортировка по модели


        /** Сортировка по году выпуска */

        Comparator<Car> yearComparator = Comparator.comparingInt(Car::getYear);
        cars.sort(yearComparator);
        System.out.println("Сортировка по году выпуска: " + cars);

//        or без использования лямбда-выражения:
//        Comparator<Car> yearComparator = new Comparator<Car>() {
//            public int compare(Car car1, Car car2) {
//                return Integer.compare(car1.getYear(), car2.getYear());
//            }
//        };
//        Collections.sort(cars, yearComparator); // сортировка по году выпуска


        /**  Сортировка по мощности двигателя */

        Comparator<Car> lsComparator = Comparator.comparingInt(car -> car.getEngine().getLs());
        cars.sort(lsComparator);
        System.out.println("Сортировка по мощности двигателя: " + cars);

        //or без использования лямбда-выражения:
//        Comparator<Car> lsComparator = new Comparator<Car>() {
//            public int compare(Car car1, Car car2) {
//                return Integer.compare(car1.getEngine().getLs(), car2.getEngine().getLs());
//            }
//        };
//      Collections.sort(cars, lsComparator); // сортировка по лошадиной силе двигателя


        /**  Сортировка по году выпуска, затем по модели, затем по мощности двигателя */
        Comparator<Car> yearModelLsComparator =
                Comparator.comparingInt(Car::getYear)
                        .thenComparing(Car::getModel)
                        .thenComparing(car -> car.getEngine().getLs());
        cars.sort(yearModelLsComparator);
        System.out.println("Сортировка по году выпуска, модели и мощности двигателя: " + cars);

        //or без использования лямбда-выражения:
//        Comparator<Car> yearModelLsComparator = new Comparator<Car>() {
//            public int compare(Car car1, Car car2) {
//                int result = Integer.compare(car1.getYear(), car2.getYear());
//                if (result != 0) {
//                    return result;
//                }
//                result = car1.getModel().compareTo(car2.getModel());
//                if (result != 0) {
//                    return result;
//                }
//                return Integer.compare(car1.getEngine().getLs(), car2.getEngine().getLs());
//            }
//        };
//      Collections.sort(cars, yearModelLsComparator); // сортировка по году выпуска, модели и лошадиной силе двигателя
    }
}
