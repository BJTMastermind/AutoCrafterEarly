package me.bjtmastermind.crafter_backport.registry;

import dan200.computercraft.api.ComputerCraftAPI;
import me.bjtmastermind.crafter_backport.CrafterBackport;
import me.bjtmastermind.crafter_backport.computercraft.CrafterPeripheral;

public class ModIntergrationRegistry {

    public static void registerIntergrations() {
        // ComputerCraft
        if (CrafterBackport.INTERGRATIONS.get("computercraft")) {
            ComputerCraftAPI.registerGenericSource(new CrafterPeripheral());
        }
    }
}
