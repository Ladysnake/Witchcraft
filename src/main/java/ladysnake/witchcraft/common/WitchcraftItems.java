package ladysnake.witchcraft.common;

import ladysnake.witchcraft.common.item.DecoctionItem;
import ladysnake.witchcraft.common.item.KettleItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PotionItem;
import net.minecraft.util.registry.Registry;

public class WitchcraftItems {
    public static Item KETTLE;
    public static Item RUSTIC_SPIRIT;

    public static void init() {
        KETTLE = registerItem(new KettleItem(new Item.Settings().group(ItemGroup.DECORATIONS)), "kettle");
        RUSTIC_SPIRIT = registerItem(new DecoctionItem(new Item.Settings().group(ItemGroup.MISC)), "rustic_spirit");
    }

    public static Item registerItem(Item item, String name) {
        Registry.register(Registry.ITEM, Witchcraft.MODID + ":" + name, item);
        return item;
    }

}
