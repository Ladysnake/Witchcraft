package ladysnake.witchcraft.common;

import ladysnake.witchcraft.common.block.CampfireKettleBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

public class WitchcraftBlocks {
    public static Block CAMPFIRE_KETTLE;

    public static void init() {
        CAMPFIRE_KETTLE = registerBlock(new CampfireKettleBlock(FabricBlockSettings.of(Material.METAL, MaterialColor.STONE).requiresTool().strength(2.0F).lightLevel(15).nonOpaque()), "campfire_kettle", ItemGroup.DECORATIONS);
    }

    private static Block registerBlock(Block block, String name, ItemGroup itemGroup) {
        Registry.register(Registry.BLOCK, Witchcraft.MODID + ":" + name, block);

        if (itemGroup != null) {
            BlockItem item = new BlockItem(block, new Item.Settings().group(itemGroup));
            item.appendBlocks(Item.BLOCK_ITEMS, item);
        }

        return block;
    }

}
