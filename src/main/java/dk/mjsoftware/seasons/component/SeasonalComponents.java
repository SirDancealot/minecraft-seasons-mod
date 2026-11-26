package dk.mjsoftware.seasons.component;

import dk.mjsoftware.seasons.SeasonalEffects;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.codec.ByteBufCodecs;

public class SeasonalComponents {
    public static final DataComponentType<Boolean> HAS_TOOLTIP = Registry.register(
            BuiltInRegistries.DATA_COMPONENT_TYPE,
            SeasonalEffects.id("has_tooltip"),
            DataComponentType.<Boolean>builder().networkSynchronized(ByteBufCodecs.BOOL).build()
    );

    public static void initialize() {}
}
