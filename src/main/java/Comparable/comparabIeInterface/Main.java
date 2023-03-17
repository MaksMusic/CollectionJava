package Comparable.comparabIeInterface;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Car> listCars = new ArrayList<>();
        listCars.add(new Car(2018, "Lada Vesta",120));
        listCars.add(new Car(1997, "Mersedes 220",250));
        listCars.add(new Car(2019, "Mersedes 222",550));
        listCars.add(new Car(1998, "Audi a6",400));

        Collections.sort(listCars);
        System.out.println(listCars);
    }

}


class Car implements Comparable<Car> {
    private int year; // год выпуска авто
    private String model;
    private Engine engine;

    public Car(int year, String model, int ls) {
        this.year = year;
        this.model = model;
        this.engine = new Engine(ls);
    }

    @Override
    public int compareTo(Car other) {
        return Integer.compare(engine.getLs(),other.engine.ls);
    }

    @Override
    public String toString() {
        return year + " " + model + "ls = "+ engine.ls;
    }

    static class Engine {
        private int ls;

        public Engine(int ls) {
            this.ls = ls;
            System.out.println();
        }

        public int getLs() {
            return ls;
        }
    }
}


