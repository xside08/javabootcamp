package com.epam.bicycle.bicycleparts;

import com.epam.bicycle.enums.BicycleCompany;

import java.util.Objects;

public class Frame {
    private BicycleCompany brandName;
    private double sizeFrame;
    private String originCountry;
    private String typeOfBicycle;

    public Frame(BicycleCompany brandName, double sizeFrame, String originCountry, String typeOfBicycle) {
        this.brandName = brandName;
        this.sizeFrame = sizeFrame;
        this.originCountry = originCountry;
        this.typeOfBicycle = typeOfBicycle;
    }

    public BicycleCompany getBrandName() {
        return brandName;
    }

    public void setBrandName(BicycleCompany brandName) {
        this.brandName = brandName;
    }

    public double getSizeFrame() {
        return sizeFrame;
    }

    public void setSizeFrame(double sizeFrame) {
        this.sizeFrame = sizeFrame;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public String getTypeOfBicycle() {
        return typeOfBicycle;
    }

    public void setTypeOfBicycle(String typeOfBicycle) {
        this.typeOfBicycle = typeOfBicycle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Frame frame = (Frame) o;
        return Double.compare(frame.sizeFrame, sizeFrame) == 0 &&
                Objects.equals(brandName, frame.brandName) &&
                Objects.equals(originCountry, frame.originCountry) &&
                Objects.equals(typeOfBicycle, frame.typeOfBicycle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, sizeFrame, originCountry, typeOfBicycle);
    }

    @Override
    public String toString() {
        return "Frame{" +
                "brandName='" + brandName + '\'' +
                ", sizeFrame=" + sizeFrame +
                ", originCountry='" + originCountry + '\'' +
                ", typeOfBicycle='" + typeOfBicycle + '\'' +
                '}';
    }
}
