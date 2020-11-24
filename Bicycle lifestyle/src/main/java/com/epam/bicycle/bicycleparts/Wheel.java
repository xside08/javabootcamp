package com.epam.bicycle.bicycleparts;

import com.epam.bicycle.enums.WheelCompany;

import java.util.Objects;

public class Wheel {
    private WheelCompany wheel;
    private int wheelSize;
    private String wheelType;

    public Wheel(WheelCompany wheel, int wheelSize, String wheelType) {
        this.wheel = wheel;
        this.wheelSize = wheelSize;
        this.wheelType = wheelType;
    }


    public WheelCompany getWheelBrand() {
        return wheel;
    }

    public void setWheelBrand(WheelCompany wheel) {
        this.wheel = wheel;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public String getWheelType() {
        return wheelType;
    }

    public void setWheelType(String wheelType) {
        this.wheelType = wheelType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel1 = (Wheel) o;
        return wheelSize == wheel1.wheelSize &&
                wheel == wheel1.wheel &&
                Objects.equals(wheelType, wheel1.wheelType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wheel, wheelSize, wheelType);
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "wheel=" + wheel +
                ", wheelSize=" + wheelSize +
                ", wheelType='" + wheelType + '\'' +
                '}';
    }
}

