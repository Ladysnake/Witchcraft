package ladysnake.witchcraft.common;

import net.fabricmc.api.ModInitializer;

public class Witchcraft implements ModInitializer {
    public static final String MODID = "witchcraft";

    @Override
    public void onInitialize() {
        WitchcraftBlocks.init();
        WitchcraftItems.init();
    }
}
