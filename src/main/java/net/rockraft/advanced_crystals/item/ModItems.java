package net.rockraft.advanced_crystals.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rockraft.advanced_crystals.Advanced_Crystals;
import net.rockraft.advanced_crystals.item.custom.CrystalScannerMk1Item;
import net.rockraft.advanced_crystals.item.custom.CrystalScannerMk2Item;
import net.rockraft.advanced_crystals.item.custom.CrystalScannerMk3Item;
import net.rockraft.advanced_crystals.item.custom.CrystalScannerMk4Item;
import net.rockraft.advanced_crystals.item.custom.CrystalScannerMk5Item;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Advanced_Crystals.MOD_ID);

    public static final RegistryObject<Item> Crystalpowder = ITEMS.register("crystal_powder",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Crystal_Tab)));

    public static final RegistryObject<Item> Crystalshard = ITEMS.register("crystal_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Crystal_Tab)));

    public static final RegistryObject<Item> pureCrystal = ITEMS.register("pure_crystal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Crystal_Tab)));

    public static final RegistryObject<Item> NetherCrystalpowder = ITEMS.register("nether_crystal_powder",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Crystal_Tab)));

    public static final RegistryObject<Item> NetherCrystalshard = ITEMS.register("nether_crystal_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Crystal_Tab)));

    public static final RegistryObject<Item> pureNetherCrystal = ITEMS.register("pure_nether_crystal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Crystal_Tab)));

    public static final RegistryObject<Item> EnderCrystalpowder = ITEMS.register("ender_crystal_powder",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Crystal_Tab)));

    public static final RegistryObject<Item> EnderCrystalshard = ITEMS.register("ender_crystal_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Crystal_Tab)));

    public static final RegistryObject<Item> pureEnderCrystal = ITEMS.register("pure_ender_crystal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Crystal_Tab)));

    public static final RegistryObject<Item> SlimeCrystalpowder = ITEMS.register("slime_crystal_powder",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Crystal_Tab)));

    public static final RegistryObject<Item> SlimeCrystalshard = ITEMS.register("slime_crystal_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Crystal_Tab)));

    public static final RegistryObject<Item> pureSlimeCrystal = ITEMS.register("pure_slime_crystal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Crystal_Tab)));





    public static final RegistryObject<Item> CrystalScannerMK1 = ITEMS.register("crystal_scanner_mk1",
            () -> new CrystalScannerMk1Item(new Item.Properties().tab(ModCreativeModeTab.Crystal_Tab).durability(16)));

    public static final RegistryObject<Item> CrystalScannerMK2 = ITEMS.register("crystal_scanner_mk2",
            () -> new CrystalScannerMk2Item(new Item.Properties().tab(ModCreativeModeTab.Crystal_Tab).durability(128)));

    public static final RegistryObject<Item> CrystalScannerMK3 = ITEMS.register("crystal_scanner_mk3",
            () -> new CrystalScannerMk3Item(new Item.Properties().tab(ModCreativeModeTab.Crystal_Tab).durability(256)));

    public static final RegistryObject<Item> CrystalScannerMK4 = ITEMS.register("crystal_scanner_mk4",
            () -> new CrystalScannerMk4Item(new Item.Properties().tab(ModCreativeModeTab.Crystal_Tab).durability(2024)));

    public static final RegistryObject<Item> CrystalScannerMK5 = ITEMS.register("crystal_scanner_mk5",
            () -> new CrystalScannerMk5Item(new Item.Properties().tab(ModCreativeModeTab.Crystal_Tab).durability(4048)));



    public  static  void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
