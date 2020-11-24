package com.epam;

import com.epam.bicycle.Bicycle;
import com.epam.bicycle.bicycleparts.*;
import com.epam.bicycle.enums.BicycleCompany;
import com.epam.bicycle.enums.WheelCompany;

public class Application {
    public static void main(String[] args) {

        BicycleCompany prod = BicycleCompany.Colnago;
        BicycleCompany prod1 = BicycleCompany.Trek;
        WheelCompany wheel = WheelCompany.ENVE;
        WheelCompany wheel2 = WheelCompany.Roval;

        Gearset gearset1 = new Gearset(prod, 11, 1);
        Wheel frontWheel = new Wheel(wheel, 29, "MTB");
        Wheel backWheel = new Wheel(wheel2, 29, "MTB");
        Wheel frontWheel1 = new Wheel(wheel, 29, "MTB");
        Equipments ekip1 = new Equipments(true, true, true);
        SuspensionFork susp1 = new SuspensionFork(29, 100, "Fox");
        Frame frame1 = new Frame(prod, 29, "USA", "MTB");
        Frame frame2 = new Frame(prod1, 19.5, "Canada", "MTB");

        Gearset gearsetTrek = new Gearset(BicycleCompany.Cannondale, 10, 2);
        Bicycle bike2 = new Bicycle(frontWheel1, backWheel, frame2, gearsetTrek, susp1);
        Frame frama = new Frame(BicycleCompany.Cannondale, 21, "Ukraine", "MTB");
        RepairStation station = new RepairStation();
        bike2.setFrontwheel(backWheel);
        station.changeFrame(bike2, frama);
        System.out.println(bike2);
        Equipments hell = new Equipments(false, false, true);
        bike2.setHelmet(hell);
        System.out.println(bike2);

        Bicycle bike = new Bicycle(frontWheel, backWheel, frame1, gearset1, susp1);
        System.out.println("Your bicycle in stok :" + bike);
        station.changeGearSet(bike, gearsetTrek);
        System.out.println("Your bicycle with modified gears: " + bike);

    }

}
