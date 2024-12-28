package me.bjtmastermind.crafter_backport.networking;

import me.bjtmastermind.crafter_backport.CrafterBackport;
import me.bjtmastermind.crafter_backport.block.entity.CrafterBlockEntity;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

public class ModMessages {
    public static final Identifier SLOT_CHANGED = new Identifier(CrafterBackport.MOD_ID, "slot_changed");

    static {
        ServerPlayNetworking.registerGlobalReceiver(SLOT_CHANGED, ((server, player, handler, buf, responseSender) -> {
            int slotId = buf.readInt();
            BlockPos pos = buf.readBlockPos();
            boolean newState = buf.readBoolean();

            server.execute(() -> {
                BlockEntity blockEntity = player.getWorld().getBlockEntity(pos);

                if (!(blockEntity instanceof CrafterBlockEntity crafterBlockEntity)) {
                    return;
                }

                crafterBlockEntity.setSlotEnabled(slotId, newState);
            });
        }));
    }
}
