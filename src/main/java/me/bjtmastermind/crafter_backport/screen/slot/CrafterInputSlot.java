//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
package me.bjtmastermind.crafter_backport.screen.slot;

import me.bjtmastermind.crafter_backport.screen.CrafterScreenHandler;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;

public class CrafterInputSlot extends Slot {
    private final CrafterScreenHandler crafterScreenHandler;

    public CrafterInputSlot(Inventory inventory, int index, int x, int y, CrafterScreenHandler crafterScreenHandler) {
        super(inventory, index, x, y);
        this.crafterScreenHandler = crafterScreenHandler;
    }

    public boolean canInsert(ItemStack stack) {
        return !this.crafterScreenHandler.isSlotDisabled(this.id) && super.canInsert(stack);
    }

    public void markDirty() {
        super.markDirty();
        this.crafterScreenHandler.onContentChanged(this.inventory);
    }
}
