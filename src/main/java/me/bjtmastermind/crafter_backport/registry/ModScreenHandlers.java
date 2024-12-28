package me.bjtmastermind.crafter_backport.registry;

import me.bjtmastermind.crafter_backport.CrafterBackport;
import me.bjtmastermind.crafter_backport.screen.CrafterScreenHandler;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<CrafterScreenHandler> CRAFTER_3X3 = Registry.register(
        Registries.SCREEN_HANDLER,
        new Identifier(CrafterBackport.MOD_ID, "crafter_3x3"),
        new ExtendedScreenHandlerType<>(CrafterScreenHandler::new)
    );

    public static void registerScreenHandlers() {
        CrafterBackport.LOGGER.info("Registering screen handlers for "+CrafterBackport.MOD_ID);
    }
}
