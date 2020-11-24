package com.epam.bicycle.bicycleparts;

import com.epam.bicycle.Bicycle;

public class RepairStation {

    public void changeFrame(Bicycle bicycle, Frame newFrame) {
        bicycle.setFrame(newFrame);
    }

    public void changeGearSet(Bicycle bicycle, Gearset newGearset) {
        bicycle.setGearset(newGearset);
    }

    public void changeEkipirovka(Bicycle bicycle, Equipments equipments) {
        bicycle.setHelmet(equipments);
    }
}
