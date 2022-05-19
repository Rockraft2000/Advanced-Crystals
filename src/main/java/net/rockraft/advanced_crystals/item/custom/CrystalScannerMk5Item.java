package net.rockraft.advanced_crystals.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.rockraft.advanced_crystals.block.ModBlocks;

public class CrystalScannerMk5Item extends Item {

    public CrystalScannerMk5Item(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if(pContext.getLevel().isClientSide()) {
            BlockPos position = pContext.getClickedPos();
            Player player = pContext.getPlayer();
            boolean foundCrystal = false;
            int searchRadius = 250;

            for(int x = position.getX()-(searchRadius/2); x <= position.getX()+(searchRadius/2); x++) {
                for(int y = position.getY()-(searchRadius/2); y <= position.getY()+(searchRadius/2); y++) {
                    for(int z = position.getZ()-(searchRadius/2); z <= position.getZ()+(searchRadius/2); z++) {
                        BlockPos blockpos = new BlockPos(x, y, z);
                        Block block = pContext.getLevel().getBlockState(blockpos).getBlock();

                        if(isCrystal(block)){
                            outputResult(player, blockpos);
                            foundCrystal = true;
                            break;
                        }
                    }
                }
            }

            if(!foundCrystal) {
                player.sendMessage(new TranslatableComponent("item.advanced_crystals.crystal_scanner_mk5.no_crystal"),
                        player.getUUID());
            }


        }

        pContext.getItemInHand().hurtAndBreak(1,pContext.getPlayer(),
                (player) -> player.broadcastBreakEvent(player.getUsedItemHand()));


        return super.useOn(pContext);
    }

    private void outputResult(Player player, BlockPos blockPos) {
        player.sendMessage(new TextComponent("Found Crystal Ore at " + blockPos.getX() + ", " + blockPos.getY() +
                ", " + blockPos.getZ()), player.getUUID());
    }

    private boolean isCrystal(Block block) {
        return block == ModBlocks.Crystal_Ore.get();
    }

}
