package me.bjtmastermind.crafter_backport.registry;

import me.bjtmastermind.crafter_backport.CrafterBackport;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSoundEvents {
    public static final SoundEvent CRAFTER_CRAFT = register("crafter_craft");
    public static final SoundEvent CRAFTER_FAIL = register("crafter_fail");

    private static SoundEvent register(String name) {
        final Identifier id = new Identifier(CrafterBackport.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        CrafterBackport.LOGGER.info("Registering sound events for "+CrafterBackport.MOD_ID);
    }
}
