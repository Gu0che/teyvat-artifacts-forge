package com.guoche.teyvat_artifacts;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.locale.Language;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.fml.ModList;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

import java.util.List;
import java.util.Locale;
import java.util.UUID;

public class WitchGiftItem extends Item implements ICurioItem {
    private static final String DESCRIPTION_KEY_SUFFIX = ".artifact_desc";
    private static final String LITTLE_WITCH_DICTIONARY_WEIGHT_SYNC_KEY = "LittleWitchDictionaryAdvancementWeight";

    private final String modifierName;

    public WitchGiftItem(String id, Properties properties) {
        super(properties.stacksTo(1));
        this.modifierName = TeyvatArtifacts.MODID + "." + id + ".bonus";
    }

    @Override
    public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
        super.appendHoverText(stack, level, tooltip, flag);
        appendDescription(stack, tooltip);
        appendLittleWitchDictionaryTooltip(stack, tooltip);
    }

    @Override
    public Component getName(ItemStack stack) {
        return Component.translatable(getDescriptionId(stack)).withStyle(ArtifactItemData.getStarColor(5));
    }

    @Override
    public boolean canEquip(SlotContext slotContext, ItemStack stack) {
        return "witch_gift".equals(slotContext.identifier());
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(SlotContext slotContext, UUID uuid, ItemStack stack) {
        if (!canEquip(slotContext, stack) || slotContext.cosmetic() || stack.is(TeyvatArtifacts.THE_LITTLE_WITCHS_DICTIONARY.get())) {
            return ImmutableMultimap.of();
        }

        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(Attributes.MAX_HEALTH, new AttributeModifier(uuid, modifierName + ".max_health", 2.0D, AttributeModifier.Operation.ADDITION));
        builder.put(Attributes.MOVEMENT_SPEED, new AttributeModifier(uuid, modifierName + ".movement_speed", 0.05D, AttributeModifier.Operation.MULTIPLY_BASE));
        builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(uuid, modifierName + ".attack_damage", 1.0D, AttributeModifier.Operation.ADDITION));
        builder.put(Attributes.ARMOR, new AttributeModifier(uuid, modifierName + ".armor", 2.0D, AttributeModifier.Operation.ADDITION));
        return builder.build();
    }

    @Override
    public boolean canSync(SlotContext slotContext, ItemStack stack) {
        return stack.is(TeyvatArtifacts.THE_LITTLE_WITCHS_DICTIONARY.get());
    }

    @Override
    public CompoundTag writeSyncData(SlotContext slotContext, ItemStack stack) {
        CompoundTag tag = new CompoundTag();
        tag.putInt(LITTLE_WITCH_DICTIONARY_WEIGHT_SYNC_KEY, ArtifactItemData.getLittleWitchDictionaryWeight(stack));
        return tag;
    }

    @Override
    public void readSyncData(SlotContext slotContext, CompoundTag tag, ItemStack stack) {
        if (tag.contains(LITTLE_WITCH_DICTIONARY_WEIGHT_SYNC_KEY, Tag.TAG_INT)) {
            ArtifactItemData.setLittleWitchDictionaryWeight(stack, tag.getInt(LITTLE_WITCH_DICTIONARY_WEIGHT_SYNC_KEY));
        }
    }

    private static void appendDescription(ItemStack stack, List<Component> tooltip) {
        String key = stack.getDescriptionId() + DESCRIPTION_KEY_SUFFIX;
        if (!Language.getInstance().has(key)) {
            return;
        }

        if (!Screen.hasShiftDown()) {
            tooltip.add(1, Component.translatable("tooltip.teyvat_artifacts.hold_shift_for_description").withStyle(ChatFormatting.DARK_GRAY));
            return;
        }

        String desc = Language.getInstance().getOrDefault(key);
        int insertIndex = 1;
        for (String line : desc.split("\\n")) {
            tooltip.add(insertIndex++, Component.literal(line).withStyle(ChatFormatting.GRAY).withStyle(ChatFormatting.ITALIC));
        }
    }

    private static void appendLittleWitchDictionaryTooltip(ItemStack stack, List<Component> tooltip) {
        if (!stack.is(TeyvatArtifacts.THE_LITTLE_WITCHS_DICTIONARY.get())) {
            return;
        }

        int weight = ArtifactItemData.getLittleWitchDictionaryWeight(stack);
        tooltip.add(Component.empty());
        tooltip.add(Component.translatable("curios.modifiers.witch_gift")
                .withStyle(ChatFormatting.LIGHT_PURPLE));
        tooltip.add(Component.translatable("tooltip.teyvat_artifacts.the_little_witchs_dictionary.max_health", format(weight * 0.1D))
                .withStyle(ChatFormatting.BLUE));
        tooltip.add(Component.translatable("tooltip.teyvat_artifacts.the_little_witchs_dictionary.movement_speed", format(weight * 0.1D))
                .withStyle(ChatFormatting.BLUE));
        tooltip.add(Component.translatable("tooltip.teyvat_artifacts.the_little_witchs_dictionary.damage_bonus", format(weight * 0.1D))
                .withStyle(ChatFormatting.BLUE));
        if (ModList.get().isLoaded("irons_spellbooks")) {
            tooltip.add(Component.translatable("tooltip.teyvat_artifacts.the_little_witchs_dictionary.max_mana", format(weight * 2.0D))
                    .withStyle(ChatFormatting.BLUE));
            tooltip.add(Component.translatable("tooltip.teyvat_artifacts.the_little_witchs_dictionary.cooldown_reduction", format(weight * 0.1D))
                    .withStyle(ChatFormatting.BLUE));
            tooltip.add(Component.translatable("tooltip.teyvat_artifacts.the_little_witchs_dictionary.cast_time_reduction", format(weight * 0.5D))
                    .withStyle(ChatFormatting.BLUE));
            tooltip.add(Component.translatable("tooltip.teyvat_artifacts.the_little_witchs_dictionary.mana_regen", format(weight * 0.5D))
                    .withStyle(ChatFormatting.BLUE));
        }
    }

    private static String format(double value) {
        return String.format(Locale.ROOT, value == Math.rint(value) ? "%.0f" : "%.1f", value);
    }
}
