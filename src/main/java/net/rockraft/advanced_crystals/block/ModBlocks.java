package net.rockraft.advanced_crystals.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rockraft.advanced_crystals.Advanced_Crystals;
import net.rockraft.advanced_crystals.item.ModCreativeModeTab;
import net.rockraft.advanced_crystals.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Advanced_Crystals.MOD_ID);

    public static final RegistryObject<Block> Crystal_Block = registerBlock("crystal_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.Crystal_Tab);

    public static final RegistryObject<Block> Pure_Crystal_Block = registerBlock("pure_crystal_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(10f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.Crystal_Tab);

    public static final RegistryObject<Block> NetherCrystal_Block = registerBlock("nether_crystal_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.Crystal_Tab);

    public static final RegistryObject<Block> Pure_NetherCrystal_Block = registerBlock("pure_nether_crystal_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(10f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.Crystal_Tab);

    public static final RegistryObject<Block> EnderCrystal_Block = registerBlock("ender_crystal_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.Crystal_Tab);

    public static final RegistryObject<Block> Pure_EnderCrystal_Block = registerBlock("pure_ender_crystal_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(10f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.Crystal_Tab);

    public static final RegistryObject<Block> SlimeCrystal_Block = registerBlock("slime_crystal_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.Crystal_Tab);

    public static final RegistryObject<Block> Pure_SlimeCrystal_Block = registerBlock("pure_slime_crystal_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(10f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.Crystal_Tab);

    public static final RegistryObject<Block> Crystal_Ore = registerBlock("crystal_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4.5f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.Crystal_Tab);



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }


    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){

        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }


    public static  void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
