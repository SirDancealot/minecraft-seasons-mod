package dk.mjsoftware.seasons.items;

import dk.mjsoftware.seasons.SeasonalEffects;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class ItemIds {
    public  static  final ResourceKey<Item> CALENDAR = create("calendar");

    public static ResourceKey<Item> create(String name) {
        return ResourceKey.create(Registries.ITEM, SeasonalEffects.id(name));
    }
}
