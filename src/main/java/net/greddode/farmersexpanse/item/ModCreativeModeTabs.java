package net.greddode.farmersexpanse.item;

import net.greddode.farmersexpanse.FarmersExpance;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FarmersExpance.MOD_ID);

    public static final Supplier<CreativeModeTab> FARMERS_EXPANSE_FOODS_TAB = CREATIVE_MODE_TAB.register("farmers_expanse_food_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.CHICKEN_NUGGET.get()))
                    .title(Component.translatable("creativetab.farmersexpanse.foods"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.CHICKEN_NUGGET);
                        output.accept(ModItems.ENERGY_DRINK);
                        output.accept(ModItems.FLOUR);
                    })
                    .build());
    public  static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}

