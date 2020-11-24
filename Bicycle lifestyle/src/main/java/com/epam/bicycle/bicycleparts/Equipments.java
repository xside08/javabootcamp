package com.epam.bicycle.bicycleparts;

import java.util.Objects;

public class Equipments {
    private boolean frontLight;
    private boolean rearLight;
    private boolean helmet;
    private boolean bottle;
    private boolean pump;
    private boolean repairKit;

    public Equipments(boolean frontLight, boolean rearLight, boolean helmet) {
        this.frontLight = frontLight;
        this.rearLight = rearLight;
        this.helmet = helmet;
    }

    public boolean isFrontLight() {
        return frontLight;
    }

    public void setFrontLight(boolean frontLight) {
        this.frontLight = frontLight;
    }

    public boolean isRearLight() {
        return rearLight;
    }

    public void setRearLight(boolean rearLight) {
        this.rearLight = rearLight;
    }

    public boolean isHelmet() {
        return helmet;
    }

    public void setHelmet(boolean helmet) {
        this.helmet = helmet;
    }

    public boolean isBottle() {
        return bottle;
    }

    public void setBottle(boolean bottle) {
        this.bottle = bottle;
    }

    public boolean isPump() {
        return pump;
    }

    public void setPump(boolean pump) {
        this.pump = pump;
    }

    public boolean isRepairKit() {
        return repairKit;
    }

    public void setRepairKit(boolean repairKit) {
        this.repairKit = repairKit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipments that = (Equipments) o;
        return frontLight == that.frontLight &&
                rearLight == that.rearLight &&
                helmet == that.helmet &&
                bottle == that.bottle &&
                pump == that.pump &&
                repairKit == that.repairKit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(frontLight, rearLight, helmet, bottle, pump, repairKit);
    }

    @Override
    public String toString() {
        return "Equipments{" +
                "frontLight=" + frontLight +
                ", rearLight=" + rearLight +
                ", helmet=" + helmet +
                ", bottle=" + bottle +
                ", pump=" + pump +
                ", repairKit=" + repairKit +
                '}';
    }
}
