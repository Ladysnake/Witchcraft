package ladysnake.witchcraft.client;

import ladysnake.witchcraft.common.WitchcraftBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.particle.DefaultParticleType;

public class WitchcraftClient implements ClientModInitializer {
    public static DefaultParticleType CAMP_LIMIT;

    @Override
    public void onInitializeClient() {
        // block renders
        BlockRenderLayerMap.INSTANCE.putBlock(WitchcraftBlocks.CAMPFIRE_KETTLE, RenderLayer.getCutout());
    }
}
