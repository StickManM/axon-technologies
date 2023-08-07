package net.stickmanm.axontechnologies.item;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModFuels {
    public static void registerModFuels(){
        FuelRegistry.INSTANCE.add(ModItems.THUNDER_FUEL, 1728000);

    }
}
