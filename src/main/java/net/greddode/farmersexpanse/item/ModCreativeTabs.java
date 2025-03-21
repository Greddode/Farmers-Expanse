package net.greddode.farmersexpanse.item;

import java.util.function.Supplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS;
    public static final Supplier<CreativeModeTab> TAB_FARMERS_EXPANSE;

    public ModCreativeTabs() {
    }

    static {
        CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "farmersexpanse");
        TAB_FARMERS_EXPANSE = CREATIVE_TABS.register("farmersexpanse",
                () -> CreativeModeTab
                        .builder()
                        .title(Component.translatable("creativetab.farmersexpanse.foods"))
                        .icon(() -> new ItemStack((ItemLike) ModItems.ENERGY_DRINK.get()))
                        .displayItems((parameters, output) -> ModItems.CREATIVE_TAB_ITEMS.forEach((item) -> output.accept((ItemLike)item.get())))
                        .build());

    }
    public static void register(IEventBus eventBus)
    {
        CREATIVE_TABS.register(eventBus);
    }
}