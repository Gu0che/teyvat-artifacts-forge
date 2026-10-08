package com.guoche.teyvat_artifacts;

import net.minecraft.core.RegistryAccess;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CraftingBookCategory;
import net.minecraft.world.item.crafting.CustomRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.Level;

import java.util.ArrayList;
import java.util.List;

public class ArtifactStarUpgradeRecipe extends CustomRecipe {
    public ArtifactStarUpgradeRecipe(ResourceLocation id, CraftingBookCategory category) {
        super(id, category);
    }

    @Override
    public boolean matches(CraftingContainer input, Level level) {
        return ArtifactCraftingHelper.isArtifactUpgrade(items(input));
    }

    @Override
    public ItemStack assemble(CraftingContainer input, RegistryAccess registryAccess) {
        return ArtifactCraftingHelper.assembleUpgradeResult(items(input));
    }

    @Override
    public boolean canCraftInDimensions(int width, int height) {
        return width * height >= 3;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return TeyvatArtifacts.ARTIFACT_STAR_UPGRADE_RECIPE.get();
    }

    private static List<ItemStack> items(CraftingContainer input) {
        List<ItemStack> stacks = new ArrayList<>();
        for (int i = 0; i < input.getContainerSize(); i++) {
            stacks.add(input.getItem(i));
        }
        return stacks;
    }
}
