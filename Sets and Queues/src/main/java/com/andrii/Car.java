package main.java.com.andrii;

import java.util.Objects;

public class Car implements Comparable<Car>{
    private int price;
    private String brand;
    private double engine;

    public Car(int price, String brand, double engine) {
        this.price = price;
        this.brand = brand;
        this.engine = engine;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price &&
                Double.compare(car.engine, engine) == 0 &&
                Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, brand, engine);
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", engine=" + engine +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return o.getBrand().compareTo(this.getBrand());
    }
}
