package dk.mjsoftware.seasons;

import dk.mjsoftware.seasons.items.Items;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;


public class CreativeTab {
    public static final ResourceKey<CreativeModeTab> SEASONAL_EFFECTS_TAB_KEY = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), SeasonalEffects.id("creative_tab"));
    public static final CreativeModeTab SEASONAL_EFFECTS_TAB = FabricCreativeModeTab.builder()
            .title(Component.literal("Seasonal Effects"))
            .icon(() -> new ItemStack(net.minecraft.world.item.Items.SEA_PICKLE))
            .displayItems(((_, output) -> output.accept(Items.CALENDAR)))
            .build();

    public static void initialize() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, SEASONAL_EFFECTS_TAB_KEY, SEASONAL_EFFECTS_TAB);
    }
}
