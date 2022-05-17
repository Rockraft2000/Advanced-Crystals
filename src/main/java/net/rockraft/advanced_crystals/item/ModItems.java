package net.rockraft.advanced_crystals.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rockraft.advanced_crystals.Advanced_Crystals;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Advanced_Crystals.MOD_ID);

    public static final RegistryObject<Item> Crystalshard = ITEMS.register("crystal_shard",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> pureCrystalshard = ITEMS.register("pure_crystal_shard",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));


    public  static  void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
