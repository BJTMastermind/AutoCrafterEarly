package me.bjtmastermind.crafter_backport.registry;

import me.bjtmastermind.crafter_backport.WhiteSmokeParticle;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;

public class ClientModParticles {
    public static void registerParticles() {
        ParticleFactoryRegistry.getInstance().register(ModParticles.WHITE_SMOKE, WhiteSmokeParticle.Factory::new);
    }
}
