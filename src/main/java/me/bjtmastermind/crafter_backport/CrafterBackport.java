package me.bjtmastermind.crafter_backport;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroups;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import me.bjtmastermind.crafter_backport.registry.ModBlockEntities;
import me.bjtmastermind.crafter_backport.registry.ModBlocks;
import me.bjtmastermind.crafter_backport.registry.ModParticles;
import me.bjtmastermind.crafter_backport.registry.ModScreenHandlers;
import me.bjtmastermind.crafter_backport.registry.ModSoundEvents;

public class CrafterBackport implements ModInitializer {
    public static final String MOD_ID = "crafter_backport";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModScreenHandlers.registerScreenHandlers();
        ModBlocks.registerBlocks();
        ModBlockEntities.registerBlockEntities();
        ModParticles.registerParticles();
        ModSoundEvents.registerSounds();

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(content -> content.addAfter(Blocks.DROPPER, ModBlocks.CRAFTER));
    }
}
