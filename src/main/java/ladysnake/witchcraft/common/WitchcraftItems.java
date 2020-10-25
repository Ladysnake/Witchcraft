package ladysnake.witchcraft.common;

import ladysnake.witchcraft.common.item.KettleItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

public class WitchcraftItems {
    public static Item KETTLE;

    public static void init() {
        KETTLE = registerItem(new KettleItem(new Item.Settings().group(ItemGroup.MISC)), "kettle");
    }

    public static Item registerItem(Item item, String name) {
        Registry.register(Registry.ITEM, Witchcraft.MODID + ":" + name, item);
        return item;
    }

}
