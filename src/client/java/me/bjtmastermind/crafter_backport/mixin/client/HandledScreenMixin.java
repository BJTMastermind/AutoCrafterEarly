package me.bjtmastermind.crafter_backport.mixin.client;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.screen.slot.Slot;
import me.bjtmastermind.crafter_backport.screen.slot.CrafterInputSlot;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import me.bjtmastermind.crafter_backport.gui.screen.ingame.CrafterScreen;

@Mixin(HandledScreen.class)
public class HandledScreenMixin {
    @SuppressWarnings("rawtypes")
    @Unique
    private final HandledScreen thisHandledScreen = (HandledScreen) (Object) this;

    @Inject(method = "drawSlot", at = @At("HEAD"), cancellable = true)
    public void drawSlotMixin(DrawContext context, Slot slot, CallbackInfo ci) {
        if (!(thisHandledScreen instanceof CrafterScreen thisCrafterScreen)) {
            return;
        }

        if (slot instanceof CrafterInputSlot crafterInputSlot) {
            if (thisCrafterScreen.getScreenHandler().isSlotDisabled(slot.id)) {
                thisCrafterScreen.drawDisabledSlot(context, crafterInputSlot);
                ci.cancel();
            }
        }
    }
}
