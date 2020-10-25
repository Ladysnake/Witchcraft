package ladysnake.witchcraft.common.item;

import ladysnake.witchcraft.common.WitchcraftBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.block.CampfireBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;

public class KettleItem extends Item {
    public KettleItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if (context.getWorld().getBlockState(context.getBlockPos()).getBlock() == Blocks.CAMPFIRE && context.getWorld().getBlockState(context.getBlockPos()).get(CampfireBlock.LIT)) {
            context.getWorld().setBlockState(context.getBlockPos(), WitchcraftBlocks.CAMPFIRE_KETTLE.getDefaultState());
            context.getWorld().playSound(null, context.getBlockPos(), SoundEvents.BLOCK_LANTERN_PLACE, SoundCategory.BLOCKS, 1f, 1f);
            context.getStack().decrement(1);
            return ActionResult.SUCCESS;
        }

        return ActionResult.PASS;
    }
}
