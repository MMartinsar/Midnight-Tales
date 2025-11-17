package net.mmartinsar.midnighttales.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mmartinsar.midnighttales.MidnightTales;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MidnightTales.MOD_ID);

    public static final RegistryObject<Item> CANDY_CORN = ITEMS.register("candy_corn",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CANDY_CORN)));

    public static final RegistryObject<Item> CHOCOLATE_CANDY = ITEMS.register("chocolate_candy",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CHOCOLATE_CANDY)));

    public static final RegistryObject<Item> SAP_LEECH = ITEMS.register("sap_leech",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TURNIP = ITEMS.register("turnip",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TURNIP)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
