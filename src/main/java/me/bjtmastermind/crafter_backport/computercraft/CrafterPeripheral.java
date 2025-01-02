package me.bjtmastermind.crafter_backport.computercraft;

import dan200.computercraft.api.lua.LuaException;
import dan200.computercraft.api.lua.LuaFunction;
import dan200.computercraft.api.peripheral.GenericPeripheral;
import me.bjtmastermind.crafter_backport.block.entity.CrafterBlockEntity;

public class CrafterPeripheral implements GenericPeripheral {

    @Override
    public String id() {
        return "minecraft:crafter";
    }

    @LuaFunction
    public final boolean isSlotDisabled(CrafterBlockEntity crafter, int slot) throws LuaException {
        if (slot <= 0 || slot >= 10) {
            throw new LuaException("Slot out of range (between 1 and 9)");
        }
        return crafter.isSlotDisabled(slot - 1);
    }

    @LuaFunction
    public final int getCraftingTicksRemaining(CrafterBlockEntity crafter) {
        return crafter.getCraftingTicksRemaining();
    }
}
