package dk.mjsoftware.seasons.items;

import dk.mjsoftware.seasons.component.SeasonalComponents;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class Items {
    public static final Item CALENDAR = registerItem(
            ItemIds.CALENDAR,
            Item::new,
            new Item.Properties().stacksTo(16).component(SeasonalComponents.HAS_TOOLTIP, true)
    );


    private static Item registerItem(ResourceKey<Item> id, Function<Item.Properties, Item> itemFactory, Item.Properties properties) {
        Item item = itemFactory.apply(properties.setId(id));

        return Registry.register(BuiltInRegistries.ITEM, id, item);
    }

    public static void initialize() {
        ItemTooltipCallback.EVENT.register((stack, _, _, lines) -> {
            Boolean hasTooltip = stack.get(SeasonalComponents.HAS_TOOLTIP);
            if (hasTooltip != null && hasTooltip) {
                String descriptionId = stack.getItem().getDescriptionId();
                MutableComponent component = Component.translatable(String.format("%s.tooltip", descriptionId));
                lines.add(component);
            }
        });
    }
}
