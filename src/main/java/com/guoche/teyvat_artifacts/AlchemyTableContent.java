package com.guoche.teyvat_artifacts;


import net.minecraft.core.registries.Registries;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public final class AlchemyTableContent {
    private static final DeferredRegister<net.minecraft.world.level.block.Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, TeyvatArtifacts.MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, TeyvatArtifacts.MODID);
    private static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, TeyvatArtifacts.MODID);
    private static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(Registries.MENU, TeyvatArtifacts.MODID);
    

    public static final RegistryObject<AlchemyTableBlock> BLOCK =
            BLOCKS.register("alchemy_table", () -> new AlchemyTableBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.METAL).strength(3.5F).sound(SoundType.METAL).noOcclusion()
                    .requiresCorrectToolForDrops().pushReaction(PushReaction.BLOCK)));
    public static final RegistryObject<AlchemyTableItem> ITEM =
            ITEMS.register("alchemy_table", () -> new AlchemyTableItem(BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<BlockEntityType<AlchemyTableBlockEntity>> BLOCK_ENTITY =
            BLOCK_ENTITIES.register("alchemy_table", () -> BlockEntityType.Builder.of(
                    AlchemyTableBlockEntity::new, BLOCK.get()).build(null));
    public static final RegistryObject<MenuType<AlchemyTableMenu>> MENU =
            MENUS.register("alchemy_table", () -> new MenuType<>(AlchemyTableMenu::new, FeatureFlags.DEFAULT_FLAGS));

    private AlchemyTableContent() {
    }

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
        ITEMS.register(bus);
        BLOCK_ENTITIES.register(bus);
        MENUS.register(bus);
        
    }

}
