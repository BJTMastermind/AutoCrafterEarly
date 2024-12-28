package me.bjtmastermind.crafter_backport.registry;

import me.bjtmastermind.crafter_backport.CrafterBackport;
import me.bjtmastermind.crafter_backport.block.entity.CrafterBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<CrafterBlockEntity> CRAFTER = Registry.register(
        Registries.BLOCK_ENTITY_TYPE,
        new Identifier("crafter"),
        FabricBlockEntityTypeBuilder.create(CrafterBlockEntity::new, ModBlocks.CRAFTER).build()
    );

    public static void registerBlockEntities() {
        CrafterBackport.LOGGER.info("Registering block entities for "+CrafterBackport.MOD_ID);
    }
}
