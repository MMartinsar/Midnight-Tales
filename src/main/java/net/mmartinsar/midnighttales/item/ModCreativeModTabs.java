package net.mmartinsar.midnighttales.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.mmartinsar.midnighttales.MidnightTales;
import net.mmartinsar.midnighttales.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MidnightTales.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SPOOKY_BLOCKS_TAB = CREATIVE_MODE_TABS.register("spooky_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.LAMENTARIA_LOG.get()))
                    .title(Component.translatable("creativetab.midnighttales.spooky_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.LAMENTARIA_LOG.get());
                        output.accept(ModBlocks.LAMENTARIA_WOOD.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> SPOOKY_FOOD_AND_DRINKS_TAB = CREATIVE_MODE_TABS.register("spooky_food_and_drinks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CHOCOLATE_CANDY.get()))
                    .withTabsBefore(SPOOKY_BLOCKS_TAB.getId())
                    .title(Component.translatable("creativetab.midnighttales.spooky_food_and_drinks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.CHOCOLATE_CANDY.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
