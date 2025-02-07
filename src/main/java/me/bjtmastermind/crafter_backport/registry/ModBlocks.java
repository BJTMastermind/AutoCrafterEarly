package me.bjtmastermind.crafter_backport.registry;

import me.bjtmastermind.crafter_backport.CrafterBackport;
import me.bjtmastermind.crafter_backport.block.CrafterBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block CRAFTER = registerBlock(
        new Identifier("crafter"),
        new CrafterBlock(FabricBlockSettings.create()
            .mapColor(MapColor.STONE_GRAY)
            .strength(1.5F, 3.5F))
    );

    private static Block registerBlock(Identifier id, Block block) {
        registerBlockItem(id, block);
        return Registry.register(Registries.BLOCK, id, block);
    }

    private static void registerBlockItem(Identifier id, Block block) {
        Registry.register(Registries.ITEM, id, new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerBlocks() {
        CrafterBackport.LOGGER.info("Registering blocks for "+CrafterBackport.MOD_ID);
    }
}
