package com.epam.bicycle;

import com.epam.bicycle.bicycleparts.*;

import java.util.Objects;

public class Bicycle {
    private int speed;
    private Wheel frontwheel;
    private Wheel rearWheel;
    private Frame frame;
    private Gearset gearset;
    private SuspensionFork fork;
    private Equipments helmet;


    public Bicycle(Wheel frontwheel, Wheel rearWheel, Frame frame, Gearset gearset, SuspensionFork fork) {
        this.frontwheel = frontwheel;
        this.rearWheel = rearWheel;
        this.frame = frame;
        this.gearset = gearset;
        this.fork = fork;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Wheel getFrontwheel() {
        return frontwheel;
    }

    public void setFrontwheel(Wheel frontwheel) {
        this.frontwheel = frontwheel;
    }

    public Wheel getRearWheel() {
        return rearWheel;
    }

    public void setRearWheel(Wheel rearWheel) {
        this.rearWheel = rearWheel;
    }

    public Frame getFrame() {
        return frame;
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    public Gearset getGearset() {
        return gearset;
    }

    public void setGearset(Gearset gearset) {
        this.gearset = gearset;
    }

    public SuspensionFork getFork() {
        return fork;
    }

    public void setFork(SuspensionFork fork) {
        this.fork = fork;
    }

    public Equipments getHelmet() {
        return helmet;
    }

    public void setHelmet(Equipments helmet) {
        this.helmet = helmet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bicycle bicycle = (Bicycle) o;
        return speed == bicycle.speed &&
                Objects.equals(frontwheel, bicycle.frontwheel) &&
                Objects.equals(rearWheel, bicycle.rearWheel) &&
                Objects.equals(frame, bicycle.frame) &&
                Objects.equals(gearset, bicycle.gearset) &&
                Objects.equals(fork, bicycle.fork) &&
                Objects.equals(helmet, bicycle.helmet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, frontwheel, rearWheel, frame, gearset, fork, helmet);
    }

    @Override
    public String toString() {
        return "Bicycle is :\n\t\tfrontwheel = " + frontwheel +
                ", \n\t\trearWheel = " + rearWheel +
                ", \n\t\tframe = " + frame +
                ", \n\t\tgearset = " + gearset +
                ", \n\t\tfork = " + fork +
                ", \n\t\tequipments = " + helmet + "\n";
    }
}