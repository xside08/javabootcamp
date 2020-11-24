package com.epam.bicycle.bicycleparts;

import com.epam.bicycle.enums.BicycleCompany;

import java.util.Objects;

public class Gearset {
    private BicycleCompany brandName;
    private Integer rearChainrings;
    private Integer frontChainrings;

    public Gearset(BicycleCompany brandName, Integer rearChainrings, Integer frontChainrings) {
        this.brandName = brandName;
        this.rearChainrings = rearChainrings;
        this.frontChainrings = frontChainrings;
    }

    //    public static Gearset getGearSetObject(String brandName, Integer rearChainrings, Integer frontChainrings) {
//        return new Gearset(brandName, rearChainrings, frontChainrings);
//    }
    public BicycleCompany getBrandName() {
        return brandName;
    }

    public void setBrandName(BicycleCompany brandName) {
        this.brandName = brandName;
    }

    public Integer getRearChainrings() {
        return rearChainrings;
    }

    public void setRearChainrings(Integer rearChainrings) {
        this.rearChainrings = rearChainrings;
    }

    public Integer getFrontChainrings() {
        return frontChainrings;
    }

    public void setFrontChainrings(Integer frontChainrings) {
        this.frontChainrings = frontChainrings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gearset gearset = (Gearset) o;
        return Objects.equals(brandName, gearset.brandName) &&
                Objects.equals(rearChainrings, gearset.rearChainrings) &&
                Objects.equals(frontChainrings, gearset.frontChainrings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, rearChainrings, frontChainrings);
    }

    @Override
    public String toString() {
        return "Gearset{" +
                "brandName='" + brandName + '\'' +
                ", rearChainrings=" + rearChainrings +
                ", frontChainrings=" + frontChainrings +
                '}';
    }
}
