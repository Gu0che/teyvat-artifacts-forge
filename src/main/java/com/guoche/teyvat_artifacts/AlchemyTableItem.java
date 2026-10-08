package com.guoche.teyvat_artifacts;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;

import java.util.List;

public class AlchemyTableItem extends BlockItem {
    public AlchemyTableItem(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
        super.appendHoverText(stack, level, tooltip, flag);
        if (!Screen.hasShiftDown()) {
            tooltip.add(Component.translatable("tooltip.teyvat_artifacts.hold_shift_for_description")
                    .withStyle(ChatFormatting.DARK_GRAY));
            return;
        }
        tooltip.add(Component.translatable("tooltip.teyvat_artifacts.alchemy_table.description")
                .withStyle(ChatFormatting.GRAY, ChatFormatting.ITALIC));
        tooltip.add(Component.translatable("tooltip.teyvat_artifacts.alchemy_table.quote")
                .withStyle(ChatFormatting.GRAY, ChatFormatting.BOLD));
    }
}
