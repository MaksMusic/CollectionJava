package Comparable.comparator;

public class Car {
    private String model;
    private int year;
    private Engine engine;

    public Car(String model, int year, int ls) {
        this.model = model;
        this.year = year;
        this.engine = new Engine(ls);
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public Engine getEngine() {
        return engine;
    }

     class Engine {
        private int ls;

        public Engine(int ls) {
            this.ls = ls;
        }

        public int getLs() {
            return ls;
        }
    }
}