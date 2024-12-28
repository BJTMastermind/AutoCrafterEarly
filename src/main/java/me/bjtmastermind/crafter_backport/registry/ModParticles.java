package me.bjtmastermind.crafter_backport.registry;

import me.bjtmastermind.crafter_backport.CrafterBackport;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModParticles {
    public static final DefaultParticleType WHITE_SMOKE = Registry.register(Registries.PARTICLE_TYPE, new Identifier(CrafterBackport.MOD_ID, "white_smoke"), FabricParticleTypes.simple(false));

    public static void registerParticles() {
        CrafterBackport.LOGGER.info("Registering particles for "+CrafterBackport.MOD_ID);
    }
}
