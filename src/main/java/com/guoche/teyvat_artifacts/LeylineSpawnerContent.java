package com.guoche.teyvat_artifacts;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class LeylineSpawnerContent {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TeyvatArtifacts.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TeyvatArtifacts.MODID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, TeyvatArtifacts.MODID);
    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, TeyvatArtifacts.MODID);

    public static final RegistryObject<MondstadtLeylineSpawnerBlock> MONDSTADT_LEYLINE_SPAWNER =
            BLOCKS.register("mondstadt_leyline_spawner", LeylineSpawnerContent::createMondstadtLeylineSpawnerBlock);
    public static final RegistryObject<BlockItem> MONDSTADT_LEYLINE_SPAWNER_ITEM =
            ITEMS.register("mondstadt_leyline_spawner", () -> new BlockItem(MONDSTADT_LEYLINE_SPAWNER.get(), new Item.Properties()));
    public static final RegistryObject<BlockEntityType<MondstadtLeylineSpawnerBlockEntity>> MONDSTADT_LEYLINE_SPAWNER_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("mondstadt_leyline_spawner", () ->
                    BlockEntityType.Builder.of(MondstadtLeylineSpawnerBlockEntity::new, MONDSTADT_LEYLINE_SPAWNER.get()).build(null));
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> MONDSTADT_LEYLINE_SPAWNER_FEATURE =
            FEATURES.register("mondstadt_leyline_spawner", () -> new MondstadtLeylineSpawnerFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<LiyueClearPoolLeylineSpawnerBlock> LIYUE_CLEAR_POOL_LEYLINE_SPAWNER =
            BLOCKS.register("liyue_clear_pool_leyline_spawner", LeylineSpawnerContent::createLiyueClearPoolLeylineSpawnerBlock);
    public static final RegistryObject<BlockItem> LIYUE_CLEAR_POOL_LEYLINE_SPAWNER_ITEM =
            ITEMS.register("liyue_clear_pool_leyline_spawner", () -> new BlockItem(LIYUE_CLEAR_POOL_LEYLINE_SPAWNER.get(), new Item.Properties()));
    public static final RegistryObject<BlockEntityType<LiyueClearPoolLeylineSpawnerBlockEntity>> LIYUE_CLEAR_POOL_LEYLINE_SPAWNER_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("liyue_clear_pool_leyline_spawner", () ->
                    BlockEntityType.Builder.of(LiyueClearPoolLeylineSpawnerBlockEntity::new, LIYUE_CLEAR_POOL_LEYLINE_SPAWNER.get()).build(null));
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> LIYUE_CLEAR_POOL_LEYLINE_SPAWNER_FEATURE =
            FEATURES.register("liyue_clear_pool_leyline_spawner", () -> new LiyueClearPoolLeylineSpawnerFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<MondstadtRidgeWatchLeylineSpawnerBlock> MONDSTADT_RIDGE_WATCH_LEYLINE_SPAWNER =
            BLOCKS.register("mondstadt_ridge_watch_leyline_spawner", LeylineSpawnerContent::createMondstadtRidgeWatchLeylineSpawnerBlock);
    public static final RegistryObject<BlockItem> MONDSTADT_RIDGE_WATCH_LEYLINE_SPAWNER_ITEM =
            ITEMS.register("mondstadt_ridge_watch_leyline_spawner", () -> new BlockItem(MONDSTADT_RIDGE_WATCH_LEYLINE_SPAWNER.get(), new Item.Properties()));
    public static final RegistryObject<BlockEntityType<MondstadtRidgeWatchLeylineSpawnerBlockEntity>> MONDSTADT_RIDGE_WATCH_LEYLINE_SPAWNER_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("mondstadt_ridge_watch_leyline_spawner", () ->
                    BlockEntityType.Builder.of(MondstadtRidgeWatchLeylineSpawnerBlockEntity::new, MONDSTADT_RIDGE_WATCH_LEYLINE_SPAWNER.get()).build(null));
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> MONDSTADT_RIDGE_WATCH_LEYLINE_SPAWNER_FEATURE =
            FEATURES.register("mondstadt_ridge_watch_leyline_spawner", () -> new MondstadtRidgeWatchLeylineSpawnerFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<MondstadtThornyCrownLeylineSpawnerBlock> MONDSTADT_THORNY_CROWN_LEYLINE_SPAWNER =
            BLOCKS.register("mondstadt_thorny_crown_leyline_spawner", LeylineSpawnerContent::createMondstadtThornyCrownLeylineSpawnerBlock);
    public static final RegistryObject<BlockItem> MONDSTADT_THORNY_CROWN_LEYLINE_SPAWNER_ITEM =
            ITEMS.register("mondstadt_thorny_crown_leyline_spawner", () -> new BlockItem(MONDSTADT_THORNY_CROWN_LEYLINE_SPAWNER.get(), new Item.Properties()));
    public static final RegistryObject<BlockEntityType<MondstadtThornyCrownLeylineSpawnerBlockEntity>> MONDSTADT_THORNY_CROWN_LEYLINE_SPAWNER_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("mondstadt_thorny_crown_leyline_spawner", () ->
                    BlockEntityType.Builder.of(MondstadtThornyCrownLeylineSpawnerBlockEntity::new, MONDSTADT_THORNY_CROWN_LEYLINE_SPAWNER.get()).build(null));
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> MONDSTADT_THORNY_CROWN_LEYLINE_SPAWNER_FEATURE =
            FEATURES.register("mondstadt_thorny_crown_leyline_spawner", () -> new MondstadtThornyCrownLeylineSpawnerFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<MondstadtPeakVindagnyrLeylineSpawnerBlock> MONDSTADT_PEAK_VINDAGNYR_LEYLINE_SPAWNER =
            BLOCKS.register("mondstadt_peak_vindagnyr_leyline_spawner", LeylineSpawnerContent::createMondstadtPeakVindagnyrLeylineSpawnerBlock);
    public static final RegistryObject<BlockItem> MONDSTADT_PEAK_VINDAGNYR_LEYLINE_SPAWNER_ITEM =
            ITEMS.register("mondstadt_peak_vindagnyr_leyline_spawner", () -> new BlockItem(MONDSTADT_PEAK_VINDAGNYR_LEYLINE_SPAWNER.get(), new Item.Properties()));
    public static final RegistryObject<BlockEntityType<MondstadtPeakVindagnyrLeylineSpawnerBlockEntity>> MONDSTADT_PEAK_VINDAGNYR_LEYLINE_SPAWNER_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("mondstadt_peak_vindagnyr_leyline_spawner", () ->
                    BlockEntityType.Builder.of(MondstadtPeakVindagnyrLeylineSpawnerBlockEntity::new, MONDSTADT_PEAK_VINDAGNYR_LEYLINE_SPAWNER.get()).build(null));
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> MONDSTADT_PEAK_VINDAGNYR_LEYLINE_SPAWNER_FEATURE =
            FEATURES.register("mondstadt_peak_vindagnyr_leyline_spawner", () -> new MondstadtPeakVindagnyrLeylineSpawnerFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<MondstadtValleyRemembranceLeylineSpawnerBlock> MONDSTADT_VALLEY_REMEMBRANCE_LEYLINE_SPAWNER =
            BLOCKS.register("mondstadt_valley_remembrance_leyline_spawner", LeylineSpawnerContent::createMondstadtValleyRemembranceLeylineSpawnerBlock);
    public static final RegistryObject<BlockItem> MONDSTADT_VALLEY_REMEMBRANCE_LEYLINE_SPAWNER_ITEM =
            ITEMS.register("mondstadt_valley_remembrance_leyline_spawner", () -> new BlockItem(MONDSTADT_VALLEY_REMEMBRANCE_LEYLINE_SPAWNER.get(), new Item.Properties()));
    public static final RegistryObject<BlockEntityType<MondstadtValleyRemembranceLeylineSpawnerBlockEntity>> MONDSTADT_VALLEY_REMEMBRANCE_LEYLINE_SPAWNER_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("mondstadt_valley_remembrance_leyline_spawner", () ->
                    BlockEntityType.Builder.of(MondstadtValleyRemembranceLeylineSpawnerBlockEntity::new, MONDSTADT_VALLEY_REMEMBRANCE_LEYLINE_SPAWNER.get()).build(null));
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> MONDSTADT_VALLEY_REMEMBRANCE_LEYLINE_SPAWNER_FEATURE =
            FEATURES.register("mondstadt_valley_remembrance_leyline_spawner", () -> new MondstadtValleyRemembranceLeylineSpawnerFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<LiyueDomainGuyunLeylineSpawnerBlock> LIYUE_DOMAIN_GUYUN_LEYLINE_SPAWNER =
            BLOCKS.register("liyue_domain_guyun_leyline_spawner", LeylineSpawnerContent::createLiyueDomainGuyunLeylineSpawnerBlock);
    public static final RegistryObject<BlockItem> LIYUE_DOMAIN_GUYUN_LEYLINE_SPAWNER_ITEM =
            ITEMS.register("liyue_domain_guyun_leyline_spawner", () -> new BlockItem(LIYUE_DOMAIN_GUYUN_LEYLINE_SPAWNER.get(), new Item.Properties()));
    public static final RegistryObject<BlockEntityType<LiyueDomainGuyunLeylineSpawnerBlockEntity>> LIYUE_DOMAIN_GUYUN_LEYLINE_SPAWNER_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("liyue_domain_guyun_leyline_spawner", () ->
                    BlockEntityType.Builder.of(LiyueDomainGuyunLeylineSpawnerBlockEntity::new, LIYUE_DOMAIN_GUYUN_LEYLINE_SPAWNER.get()).build(null));
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> LIYUE_DOMAIN_GUYUN_LEYLINE_SPAWNER_FEATURE =
            FEATURES.register("liyue_domain_guyun_leyline_spawner", () -> new LiyueDomainGuyunLeylineSpawnerFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<LiyueLostValleyLeylineSpawnerBlock> LIYUE_LOST_VALLEY_LEYLINE_SPAWNER =
            BLOCKS.register("liyue_lost_valley_leyline_spawner", LeylineSpawnerContent::createLiyueLostValleyLeylineSpawnerBlock);
    public static final RegistryObject<BlockItem> LIYUE_LOST_VALLEY_LEYLINE_SPAWNER_ITEM =
            ITEMS.register("liyue_lost_valley_leyline_spawner", () -> new BlockItem(LIYUE_LOST_VALLEY_LEYLINE_SPAWNER.get(), new Item.Properties()));
    public static final RegistryObject<BlockEntityType<LiyueLostValleyLeylineSpawnerBlockEntity>> LIYUE_LOST_VALLEY_LEYLINE_SPAWNER_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("liyue_lost_valley_leyline_spawner", () ->
                    BlockEntityType.Builder.of(LiyueLostValleyLeylineSpawnerBlockEntity::new, LIYUE_LOST_VALLEY_LEYLINE_SPAWNER.get()).build(null));
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> LIYUE_LOST_VALLEY_LEYLINE_SPAWNER_FEATURE =
            FEATURES.register("liyue_lost_valley_leyline_spawner", () -> new LiyueLostValleyLeylineSpawnerFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<LiyueZhouFormulaLeylineSpawnerBlock> LIYUE_ZHOU_FORMULA_LEYLINE_SPAWNER =
            BLOCKS.register("liyue_zhou_formula_leyline_spawner", LeylineSpawnerContent::createLiyueZhouFormulaLeylineSpawnerBlock);
    public static final RegistryObject<BlockItem> LIYUE_ZHOU_FORMULA_LEYLINE_SPAWNER_ITEM =
            ITEMS.register("liyue_zhou_formula_leyline_spawner", () -> new BlockItem(LIYUE_ZHOU_FORMULA_LEYLINE_SPAWNER.get(), new Item.Properties()));
    public static final RegistryObject<BlockEntityType<LiyueZhouFormulaLeylineSpawnerBlockEntity>> LIYUE_ZHOU_FORMULA_LEYLINE_SPAWNER_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("liyue_zhou_formula_leyline_spawner", () ->
                    BlockEntityType.Builder.of(LiyueZhouFormulaLeylineSpawnerBlockEntity::new, LIYUE_ZHOU_FORMULA_LEYLINE_SPAWNER.get()).build(null));
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> LIYUE_ZHOU_FORMULA_LEYLINE_SPAWNER_FEATURE =
            FEATURES.register("liyue_zhou_formula_leyline_spawner", () -> new LiyueZhouFormulaLeylineSpawnerFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<InazumaMomijiDyedCourtLeylineSpawnerBlock> INAZUMA_MOMIJI_DYED_COURT_LEYLINE_SPAWNER =
            BLOCKS.register("inazuma_momiji_dyed_court_leyline_spawner", LeylineSpawnerContent::createInazumaMomijiDyedCourtLeylineSpawnerBlock);
    public static final RegistryObject<BlockItem> INAZUMA_MOMIJI_DYED_COURT_LEYLINE_SPAWNER_ITEM =
            ITEMS.register("inazuma_momiji_dyed_court_leyline_spawner", () -> new BlockItem(INAZUMA_MOMIJI_DYED_COURT_LEYLINE_SPAWNER.get(), new Item.Properties()));
    public static final RegistryObject<BlockEntityType<InazumaMomijiDyedCourtLeylineSpawnerBlockEntity>> INAZUMA_MOMIJI_DYED_COURT_LEYLINE_SPAWNER_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("inazuma_momiji_dyed_court_leyline_spawner", () ->
                    BlockEntityType.Builder.of(InazumaMomijiDyedCourtLeylineSpawnerBlockEntity::new, INAZUMA_MOMIJI_DYED_COURT_LEYLINE_SPAWNER.get()).build(null));
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> INAZUMA_MOMIJI_DYED_COURT_LEYLINE_SPAWNER_FEATURE =
            FEATURES.register("inazuma_momiji_dyed_court_leyline_spawner", () -> new InazumaMomijiDyedCourtLeylineSpawnerFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<InazumaSlumberingCourtLeylineSpawnerBlock> INAZUMA_SLUMBERING_COURT_LEYLINE_SPAWNER =
            BLOCKS.register("inazuma_slumbering_court_leyline_spawner", LeylineSpawnerContent::createInazumaSlumberingCourtLeylineSpawnerBlock);
    public static final RegistryObject<BlockItem> INAZUMA_SLUMBERING_COURT_LEYLINE_SPAWNER_ITEM =
            ITEMS.register("inazuma_slumbering_court_leyline_spawner", () -> new BlockItem(INAZUMA_SLUMBERING_COURT_LEYLINE_SPAWNER.get(), new Item.Properties()));
    public static final RegistryObject<BlockEntityType<InazumaSlumberingCourtLeylineSpawnerBlockEntity>> INAZUMA_SLUMBERING_COURT_LEYLINE_SPAWNER_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("inazuma_slumbering_court_leyline_spawner", () ->
                    BlockEntityType.Builder.of(InazumaSlumberingCourtLeylineSpawnerBlockEntity::new, INAZUMA_SLUMBERING_COURT_LEYLINE_SPAWNER.get()).build(null));
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> INAZUMA_SLUMBERING_COURT_LEYLINE_SPAWNER_FEATURE =
            FEATURES.register("inazuma_slumbering_court_leyline_spawner", () -> new InazumaSlumberingCourtLeylineSpawnerFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<SumeruMoltenIronFortressLeylineSpawnerBlock> SUMERU_MOLTEN_IRON_FORTRESS_LEYLINE_SPAWNER =
            BLOCKS.register("sumeru_molten_iron_fortress_leyline_spawner", LeylineSpawnerContent::createSumeruMoltenIronFortressLeylineSpawnerBlock);
    public static final RegistryObject<BlockItem> SUMERU_MOLTEN_IRON_FORTRESS_LEYLINE_SPAWNER_ITEM =
            ITEMS.register("sumeru_molten_iron_fortress_leyline_spawner", () -> new BlockItem(SUMERU_MOLTEN_IRON_FORTRESS_LEYLINE_SPAWNER.get(), new Item.Properties()));
    public static final RegistryObject<BlockEntityType<SumeruMoltenIronFortressLeylineSpawnerBlockEntity>> SUMERU_MOLTEN_IRON_FORTRESS_LEYLINE_SPAWNER_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("sumeru_molten_iron_fortress_leyline_spawner", () ->
                    BlockEntityType.Builder.of(SumeruMoltenIronFortressLeylineSpawnerBlockEntity::new, SUMERU_MOLTEN_IRON_FORTRESS_LEYLINE_SPAWNER.get()).build(null));
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> SUMERU_MOLTEN_IRON_FORTRESS_LEYLINE_SPAWNER_FEATURE =
            FEATURES.register("sumeru_molten_iron_fortress_leyline_spawner", () -> new SumeruMoltenIronFortressLeylineSpawnerFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<SumeruSolitaryEnlightenmentLeylineSpawnerBlock> SUMERU_SOLITARY_ENLIGHTENMENT_LEYLINE_SPAWNER =
            BLOCKS.register("sumeru_solitary_enlightenment_leyline_spawner", LeylineSpawnerContent::createSumeruSolitaryEnlightenmentLeylineSpawnerBlock);
    public static final RegistryObject<BlockItem> SUMERU_SOLITARY_ENLIGHTENMENT_LEYLINE_SPAWNER_ITEM =
            ITEMS.register("sumeru_solitary_enlightenment_leyline_spawner", () -> new BlockItem(SUMERU_SOLITARY_ENLIGHTENMENT_LEYLINE_SPAWNER.get(), new Item.Properties()));
    public static final RegistryObject<BlockEntityType<SumeruSolitaryEnlightenmentLeylineSpawnerBlockEntity>> SUMERU_SOLITARY_ENLIGHTENMENT_LEYLINE_SPAWNER_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("sumeru_solitary_enlightenment_leyline_spawner", () ->
                    BlockEntityType.Builder.of(SumeruSolitaryEnlightenmentLeylineSpawnerBlockEntity::new, SUMERU_SOLITARY_ENLIGHTENMENT_LEYLINE_SPAWNER.get()).build(null));
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> SUMERU_SOLITARY_ENLIGHTENMENT_LEYLINE_SPAWNER_FEATURE =
            FEATURES.register("sumeru_solitary_enlightenment_leyline_spawner", () -> new SumeruSolitaryEnlightenmentLeylineSpawnerFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<SumeruCityGoldLeylineSpawnerBlock> SUMERU_CITY_GOLD_LEYLINE_SPAWNER =
            BLOCKS.register("sumeru_city_gold_leyline_spawner", LeylineSpawnerContent::createSumeruCityGoldLeylineSpawnerBlock);
    public static final RegistryObject<BlockItem> SUMERU_CITY_GOLD_LEYLINE_SPAWNER_ITEM =
            ITEMS.register("sumeru_city_gold_leyline_spawner", () -> new BlockItem(SUMERU_CITY_GOLD_LEYLINE_SPAWNER.get(), new Item.Properties()));
    public static final RegistryObject<BlockEntityType<SumeruCityGoldLeylineSpawnerBlockEntity>> SUMERU_CITY_GOLD_LEYLINE_SPAWNER_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("sumeru_city_gold_leyline_spawner", () ->
                    BlockEntityType.Builder.of(SumeruCityGoldLeylineSpawnerBlockEntity::new, SUMERU_CITY_GOLD_LEYLINE_SPAWNER.get()).build(null));
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> SUMERU_CITY_GOLD_LEYLINE_SPAWNER_FEATURE =
            FEATURES.register("sumeru_city_gold_leyline_spawner", () -> new SumeruCityGoldLeylineSpawnerFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<FontaineWaterfallWenLeylineSpawnerBlock> FONTAINE_WATERFALL_WEN_LEYLINE_SPAWNER =
            BLOCKS.register("fontaine_waterfall_wen_leyline_spawner", LeylineSpawnerContent::createFontaineWaterfallWenLeylineSpawnerBlock);
    public static final RegistryObject<BlockItem> FONTAINE_WATERFALL_WEN_LEYLINE_SPAWNER_ITEM =
            ITEMS.register("fontaine_waterfall_wen_leyline_spawner", () -> new BlockItem(FONTAINE_WATERFALL_WEN_LEYLINE_SPAWNER.get(), new Item.Properties()));
    public static final RegistryObject<BlockEntityType<FontaineWaterfallWenLeylineSpawnerBlockEntity>> FONTAINE_WATERFALL_WEN_LEYLINE_SPAWNER_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("fontaine_waterfall_wen_leyline_spawner", () ->
                    BlockEntityType.Builder.of(FontaineWaterfallWenLeylineSpawnerBlockEntity::new, FONTAINE_WATERFALL_WEN_LEYLINE_SPAWNER.get()).build(null));
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> FONTAINE_WATERFALL_WEN_LEYLINE_SPAWNER_FEATURE =
            FEATURES.register("fontaine_waterfall_wen_leyline_spawner", () -> new FontaineWaterfallWenLeylineSpawnerFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<FontaineDenouementSinLeylineSpawnerBlock> FONTAINE_DENOUEMENT_SIN_LEYLINE_SPAWNER =
            BLOCKS.register("fontaine_denouement_sin_leyline_spawner", LeylineSpawnerContent::createFontaineDenouementSinLeylineSpawnerBlock);
    public static final RegistryObject<BlockItem> FONTAINE_DENOUEMENT_SIN_LEYLINE_SPAWNER_ITEM =
            ITEMS.register("fontaine_denouement_sin_leyline_spawner", () -> new BlockItem(FONTAINE_DENOUEMENT_SIN_LEYLINE_SPAWNER.get(), new Item.Properties()));
    public static final RegistryObject<BlockEntityType<FontaineDenouementSinLeylineSpawnerBlockEntity>> FONTAINE_DENOUEMENT_SIN_LEYLINE_SPAWNER_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("fontaine_denouement_sin_leyline_spawner", () ->
                    BlockEntityType.Builder.of(FontaineDenouementSinLeylineSpawnerBlockEntity::new, FONTAINE_DENOUEMENT_SIN_LEYLINE_SPAWNER.get()).build(null));
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> FONTAINE_DENOUEMENT_SIN_LEYLINE_SPAWNER_FEATURE =
            FEATURES.register("fontaine_denouement_sin_leyline_spawner", () -> new FontaineDenouementSinLeylineSpawnerFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<FontaineFadedTheaterLeylineSpawnerBlock> FONTAINE_FADED_THEATER_LEYLINE_SPAWNER =
            BLOCKS.register("fontaine_faded_theater_leyline_spawner", LeylineSpawnerContent::createFontaineFadedTheaterLeylineSpawnerBlock);
    public static final RegistryObject<BlockItem> FONTAINE_FADED_THEATER_LEYLINE_SPAWNER_ITEM =
            ITEMS.register("fontaine_faded_theater_leyline_spawner", () -> new BlockItem(FONTAINE_FADED_THEATER_LEYLINE_SPAWNER.get(), new Item.Properties()));
    public static final RegistryObject<BlockEntityType<FontaineFadedTheaterLeylineSpawnerBlockEntity>> FONTAINE_FADED_THEATER_LEYLINE_SPAWNER_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("fontaine_faded_theater_leyline_spawner", () ->
                    BlockEntityType.Builder.of(FontaineFadedTheaterLeylineSpawnerBlockEntity::new, FONTAINE_FADED_THEATER_LEYLINE_SPAWNER.get()).build(null));
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> FONTAINE_FADED_THEATER_LEYLINE_SPAWNER_FEATURE =
            FEATURES.register("fontaine_faded_theater_leyline_spawner", () -> new FontaineFadedTheaterLeylineSpawnerFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<NatlanDerelictMasonryDockLeylineSpawnerBlock> NATLAN_DERELICT_MASONRY_DOCK_LEYLINE_SPAWNER =
            BLOCKS.register("natlan_derelict_masonry_dock_leyline_spawner", LeylineSpawnerContent::createNatlanDerelictMasonryDockLeylineSpawnerBlock);
    public static final RegistryObject<BlockItem> NATLAN_DERELICT_MASONRY_DOCK_LEYLINE_SPAWNER_ITEM =
            ITEMS.register("natlan_derelict_masonry_dock_leyline_spawner", () -> new BlockItem(NATLAN_DERELICT_MASONRY_DOCK_LEYLINE_SPAWNER.get(), new Item.Properties()));
    public static final RegistryObject<BlockEntityType<NatlanDerelictMasonryDockLeylineSpawnerBlockEntity>> NATLAN_DERELICT_MASONRY_DOCK_LEYLINE_SPAWNER_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("natlan_derelict_masonry_dock_leyline_spawner", () ->
                    BlockEntityType.Builder.of(NatlanDerelictMasonryDockLeylineSpawnerBlockEntity::new, NATLAN_DERELICT_MASONRY_DOCK_LEYLINE_SPAWNER.get()).build(null));
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> NATLAN_DERELICT_MASONRY_DOCK_LEYLINE_SPAWNER_FEATURE =
            FEATURES.register("natlan_derelict_masonry_dock_leyline_spawner", () -> new NatlanDerelictMasonryDockLeylineSpawnerFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<NatlanRainbowSanctumLeylineSpawnerBlock> NATLAN_RAINBOW_SANCTUM_LEYLINE_SPAWNER =
            BLOCKS.register("natlan_rainbow_sanctum_leyline_spawner", LeylineSpawnerContent::createNatlanRainbowSanctumLeylineSpawnerBlock);
    public static final RegistryObject<BlockItem> NATLAN_RAINBOW_SANCTUM_LEYLINE_SPAWNER_ITEM =
            ITEMS.register("natlan_rainbow_sanctum_leyline_spawner", () -> new BlockItem(NATLAN_RAINBOW_SANCTUM_LEYLINE_SPAWNER.get(), new Item.Properties()));
    public static final RegistryObject<BlockEntityType<NatlanRainbowSanctumLeylineSpawnerBlockEntity>> NATLAN_RAINBOW_SANCTUM_LEYLINE_SPAWNER_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("natlan_rainbow_sanctum_leyline_spawner", () ->
                    BlockEntityType.Builder.of(NatlanRainbowSanctumLeylineSpawnerBlockEntity::new, NATLAN_RAINBOW_SANCTUM_LEYLINE_SPAWNER.get()).build(null));
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> NATLAN_RAINBOW_SANCTUM_LEYLINE_SPAWNER_FEATURE =
            FEATURES.register("natlan_rainbow_sanctum_leyline_spawner", () -> new NatlanRainbowSanctumLeylineSpawnerFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<NodKraiMoonchildsTreasuresLeylineSpawnerBlock> NOD_KRAI_MOONCHILDS_TREASURES_LEYLINE_SPAWNER =
            BLOCKS.register("nod_krai_moonchilds_treasures_leyline_spawner", LeylineSpawnerContent::createNodKraiMoonchildsTreasuresLeylineSpawnerBlock);
    public static final RegistryObject<BlockItem> NOD_KRAI_MOONCHILDS_TREASURES_LEYLINE_SPAWNER_ITEM =
            ITEMS.register("nod_krai_moonchilds_treasures_leyline_spawner", () -> new BlockItem(NOD_KRAI_MOONCHILDS_TREASURES_LEYLINE_SPAWNER.get(), new Item.Properties()));
    public static final RegistryObject<BlockEntityType<NodKraiMoonchildsTreasuresLeylineSpawnerBlockEntity>> NOD_KRAI_MOONCHILDS_TREASURES_LEYLINE_SPAWNER_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("nod_krai_moonchilds_treasures_leyline_spawner", () ->
                    BlockEntityType.Builder.of(NodKraiMoonchildsTreasuresLeylineSpawnerBlockEntity::new, NOD_KRAI_MOONCHILDS_TREASURES_LEYLINE_SPAWNER.get()).build(null));
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> NOD_KRAI_MOONCHILDS_TREASURES_LEYLINE_SPAWNER_FEATURE =
            FEATURES.register("nod_krai_moonchilds_treasures_leyline_spawner", () -> new NodKraiMoonchildsTreasuresLeylineSpawnerFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<NodKraiFrostladenMachineryLeylineSpawnerBlock> NOD_KRAI_FROSTLADEN_MACHINERY_LEYLINE_SPAWNER =
            BLOCKS.register("nod_krai_frostladen_machinery_leyline_spawner", LeylineSpawnerContent::createNodKraiFrostladenMachineryLeylineSpawnerBlock);
    public static final RegistryObject<BlockItem> NOD_KRAI_FROSTLADEN_MACHINERY_LEYLINE_SPAWNER_ITEM =
            ITEMS.register("nod_krai_frostladen_machinery_leyline_spawner", () -> new BlockItem(NOD_KRAI_FROSTLADEN_MACHINERY_LEYLINE_SPAWNER.get(), new Item.Properties()));
    public static final RegistryObject<BlockEntityType<NodKraiFrostladenMachineryLeylineSpawnerBlockEntity>> NOD_KRAI_FROSTLADEN_MACHINERY_LEYLINE_SPAWNER_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("nod_krai_frostladen_machinery_leyline_spawner", () ->
                    BlockEntityType.Builder.of(NodKraiFrostladenMachineryLeylineSpawnerBlockEntity::new, NOD_KRAI_FROSTLADEN_MACHINERY_LEYLINE_SPAWNER.get()).build(null));
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> NOD_KRAI_FROSTLADEN_MACHINERY_LEYLINE_SPAWNER_FEATURE =
            FEATURES.register("nod_krai_frostladen_machinery_leyline_spawner", () -> new NodKraiFrostladenMachineryLeylineSpawnerFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<SnezhnayaInvertedGlacierLeylineSpawnerBlock> SNEZHNAYA_INVERTED_GLACIER_LEYLINE_SPAWNER =
            BLOCKS.register("snezhnaya_inverted_glacier_leyline_spawner", LeylineSpawnerContent::createSnezhnayaInvertedGlacierLeylineSpawnerBlock);
    public static final RegistryObject<BlockItem> SNEZHNAYA_INVERTED_GLACIER_LEYLINE_SPAWNER_ITEM =
            ITEMS.register("snezhnaya_inverted_glacier_leyline_spawner", () -> new BlockItem(SNEZHNAYA_INVERTED_GLACIER_LEYLINE_SPAWNER.get(), new Item.Properties()));
    public static final RegistryObject<BlockEntityType<SnezhnayaInvertedGlacierLeylineSpawnerBlockEntity>> SNEZHNAYA_INVERTED_GLACIER_LEYLINE_SPAWNER_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("snezhnaya_inverted_glacier_leyline_spawner", () ->
                    BlockEntityType.Builder.of(SnezhnayaInvertedGlacierLeylineSpawnerBlockEntity::new, SNEZHNAYA_INVERTED_GLACIER_LEYLINE_SPAWNER.get()).build(null));
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> SNEZHNAYA_INVERTED_GLACIER_LEYLINE_SPAWNER_FEATURE =
            FEATURES.register("snezhnaya_inverted_glacier_leyline_spawner", () -> new SnezhnayaInvertedGlacierLeylineSpawnerFeature(NoneFeatureConfiguration.CODEC));


    private LeylineSpawnerContent() {
    }

    private static MondstadtLeylineSpawnerBlock createMondstadtLeylineSpawnerBlock() {
        return new MondstadtLeylineSpawnerBlock(BlockBehaviour.Properties.of()
                .lightLevel(state -> state.getValue(MondstadtLeylineSpawnerBlock.PHASE).lightLevel())
                .strength(50.0F, 1200.0F)
                .sound(SoundType.METAL)
                .isViewBlocking((state, level, pos) -> false)
                .noOcclusion()
                .requiresCorrectToolForDrops());
    }

    private static LiyueClearPoolLeylineSpawnerBlock createLiyueClearPoolLeylineSpawnerBlock() {
        return new LiyueClearPoolLeylineSpawnerBlock(BlockBehaviour.Properties.of()
                .lightLevel(state -> state.getValue(LiyueClearPoolLeylineSpawnerBlock.PHASE).lightLevel())
                .strength(50.0F, 1200.0F)
                .sound(SoundType.METAL)
                .isViewBlocking((state, level, pos) -> false)
                .noOcclusion()
                .requiresCorrectToolForDrops());
    }

    private static MondstadtRidgeWatchLeylineSpawnerBlock createMondstadtRidgeWatchLeylineSpawnerBlock() {
        return new MondstadtRidgeWatchLeylineSpawnerBlock(BlockBehaviour.Properties.of()
                .lightLevel(state -> state.getValue(MondstadtRidgeWatchLeylineSpawnerBlock.PHASE).lightLevel())
                .strength(50.0F, 1200.0F)
                .sound(SoundType.METAL)
                .isViewBlocking((state, level, pos) -> false)
                .noOcclusion()
                .requiresCorrectToolForDrops());
    }

    private static MondstadtThornyCrownLeylineSpawnerBlock createMondstadtThornyCrownLeylineSpawnerBlock() {
        return new MondstadtThornyCrownLeylineSpawnerBlock(BlockBehaviour.Properties.of()
                .lightLevel(state -> state.getValue(MondstadtThornyCrownLeylineSpawnerBlock.PHASE).lightLevel())
                .strength(50.0F, 1200.0F)
                .sound(SoundType.METAL)
                .isViewBlocking((state, level, pos) -> false)
                .noOcclusion()
                .requiresCorrectToolForDrops());
    }

    private static MondstadtPeakVindagnyrLeylineSpawnerBlock createMondstadtPeakVindagnyrLeylineSpawnerBlock() {
        return new MondstadtPeakVindagnyrLeylineSpawnerBlock(BlockBehaviour.Properties.of()
                .lightLevel(state -> state.getValue(MondstadtPeakVindagnyrLeylineSpawnerBlock.PHASE).lightLevel())
                .strength(50.0F, 1200.0F)
                .sound(SoundType.METAL)
                .isViewBlocking((state, level, pos) -> false)
                .noOcclusion()
                .requiresCorrectToolForDrops());
    }

    private static MondstadtValleyRemembranceLeylineSpawnerBlock createMondstadtValleyRemembranceLeylineSpawnerBlock() {
        return new MondstadtValleyRemembranceLeylineSpawnerBlock(BlockBehaviour.Properties.of()
                .lightLevel(state -> state.getValue(MondstadtValleyRemembranceLeylineSpawnerBlock.PHASE).lightLevel())
                .strength(50.0F, 1200.0F)
                .sound(SoundType.METAL)
                .isViewBlocking((state, level, pos) -> false)
                .noOcclusion()
                .requiresCorrectToolForDrops());
    }

    private static LiyueDomainGuyunLeylineSpawnerBlock createLiyueDomainGuyunLeylineSpawnerBlock() {
        return new LiyueDomainGuyunLeylineSpawnerBlock(BlockBehaviour.Properties.of()
                .lightLevel(state -> state.getValue(LiyueDomainGuyunLeylineSpawnerBlock.PHASE).lightLevel())
                .strength(50.0F, 1200.0F)
                .sound(SoundType.METAL)
                .isViewBlocking((state, level, pos) -> false)
                .noOcclusion()
                .requiresCorrectToolForDrops());
    }

    private static LiyueLostValleyLeylineSpawnerBlock createLiyueLostValleyLeylineSpawnerBlock() {
        return new LiyueLostValleyLeylineSpawnerBlock(BlockBehaviour.Properties.of()
                .lightLevel(state -> state.getValue(LiyueLostValleyLeylineSpawnerBlock.PHASE).lightLevel())
                .strength(50.0F, 1200.0F)
                .sound(SoundType.METAL)
                .isViewBlocking((state, level, pos) -> false)
                .noOcclusion()
                .requiresCorrectToolForDrops());
    }

    private static LiyueZhouFormulaLeylineSpawnerBlock createLiyueZhouFormulaLeylineSpawnerBlock() {
        return new LiyueZhouFormulaLeylineSpawnerBlock(BlockBehaviour.Properties.of()
                .lightLevel(state -> state.getValue(LiyueZhouFormulaLeylineSpawnerBlock.PHASE).lightLevel())
                .strength(50.0F, 1200.0F)
                .sound(SoundType.METAL)
                .isViewBlocking((state, level, pos) -> false)
                .noOcclusion()
                .requiresCorrectToolForDrops());
    }

    private static InazumaMomijiDyedCourtLeylineSpawnerBlock createInazumaMomijiDyedCourtLeylineSpawnerBlock() {
        return new InazumaMomijiDyedCourtLeylineSpawnerBlock(BlockBehaviour.Properties.of()
                .lightLevel(state -> state.getValue(InazumaMomijiDyedCourtLeylineSpawnerBlock.PHASE).lightLevel())
                .strength(50.0F, 1200.0F)
                .sound(SoundType.METAL)
                .isViewBlocking((state, level, pos) -> false)
                .noOcclusion()
                .requiresCorrectToolForDrops());
    }

    private static InazumaSlumberingCourtLeylineSpawnerBlock createInazumaSlumberingCourtLeylineSpawnerBlock() {
        return new InazumaSlumberingCourtLeylineSpawnerBlock(BlockBehaviour.Properties.of()
                .lightLevel(state -> state.getValue(InazumaSlumberingCourtLeylineSpawnerBlock.PHASE).lightLevel())
                .strength(50.0F, 1200.0F)
                .sound(SoundType.METAL)
                .isViewBlocking((state, level, pos) -> false)
                .noOcclusion()
                .requiresCorrectToolForDrops());
    }

    private static SumeruMoltenIronFortressLeylineSpawnerBlock createSumeruMoltenIronFortressLeylineSpawnerBlock() {
        return new SumeruMoltenIronFortressLeylineSpawnerBlock(BlockBehaviour.Properties.of()
                .lightLevel(state -> state.getValue(SumeruMoltenIronFortressLeylineSpawnerBlock.PHASE).lightLevel())
                .strength(50.0F, 1200.0F)
                .sound(SoundType.METAL)
                .isViewBlocking((state, level, pos) -> false)
                .noOcclusion()
                .requiresCorrectToolForDrops());
    }

    private static SumeruSolitaryEnlightenmentLeylineSpawnerBlock createSumeruSolitaryEnlightenmentLeylineSpawnerBlock() {
        return new SumeruSolitaryEnlightenmentLeylineSpawnerBlock(BlockBehaviour.Properties.of()
                .lightLevel(state -> state.getValue(SumeruSolitaryEnlightenmentLeylineSpawnerBlock.PHASE).lightLevel())
                .strength(50.0F, 1200.0F)
                .sound(SoundType.METAL)
                .isViewBlocking((state, level, pos) -> false)
                .noOcclusion()
                .requiresCorrectToolForDrops());
    }

    private static SumeruCityGoldLeylineSpawnerBlock createSumeruCityGoldLeylineSpawnerBlock() {
        return new SumeruCityGoldLeylineSpawnerBlock(BlockBehaviour.Properties.of()
                .lightLevel(state -> state.getValue(SumeruCityGoldLeylineSpawnerBlock.PHASE).lightLevel())
                .strength(50.0F, 1200.0F)
                .sound(SoundType.METAL)
                .isViewBlocking((state, level, pos) -> false)
                .noOcclusion()
                .requiresCorrectToolForDrops());
    }

    private static FontaineWaterfallWenLeylineSpawnerBlock createFontaineWaterfallWenLeylineSpawnerBlock() {
        return new FontaineWaterfallWenLeylineSpawnerBlock(BlockBehaviour.Properties.of()
                .lightLevel(state -> state.getValue(FontaineWaterfallWenLeylineSpawnerBlock.PHASE).lightLevel())
                .strength(50.0F, 1200.0F)
                .sound(SoundType.METAL)
                .isViewBlocking((state, level, pos) -> false)
                .noOcclusion()
                .requiresCorrectToolForDrops());
    }

    private static FontaineDenouementSinLeylineSpawnerBlock createFontaineDenouementSinLeylineSpawnerBlock() {
        return new FontaineDenouementSinLeylineSpawnerBlock(BlockBehaviour.Properties.of()
                .lightLevel(state -> state.getValue(FontaineDenouementSinLeylineSpawnerBlock.PHASE).lightLevel())
                .strength(50.0F, 1200.0F)
                .sound(SoundType.METAL)
                .isViewBlocking((state, level, pos) -> false)
                .noOcclusion()
                .requiresCorrectToolForDrops());
    }

    private static FontaineFadedTheaterLeylineSpawnerBlock createFontaineFadedTheaterLeylineSpawnerBlock() {
        return new FontaineFadedTheaterLeylineSpawnerBlock(BlockBehaviour.Properties.of()
                .lightLevel(state -> state.getValue(FontaineFadedTheaterLeylineSpawnerBlock.PHASE).lightLevel())
                .strength(50.0F, 1200.0F)
                .sound(SoundType.METAL)
                .isViewBlocking((state, level, pos) -> false)
                .noOcclusion()
                .requiresCorrectToolForDrops());
    }

    private static NatlanDerelictMasonryDockLeylineSpawnerBlock createNatlanDerelictMasonryDockLeylineSpawnerBlock() {
        return new NatlanDerelictMasonryDockLeylineSpawnerBlock(BlockBehaviour.Properties.of()
                .lightLevel(state -> state.getValue(NatlanDerelictMasonryDockLeylineSpawnerBlock.PHASE).lightLevel())
                .strength(50.0F, 1200.0F)
                .sound(SoundType.METAL)
                .isViewBlocking((state, level, pos) -> false)
                .noOcclusion()
                .requiresCorrectToolForDrops());
    }

    private static NatlanRainbowSanctumLeylineSpawnerBlock createNatlanRainbowSanctumLeylineSpawnerBlock() {
        return new NatlanRainbowSanctumLeylineSpawnerBlock(BlockBehaviour.Properties.of()
                .lightLevel(state -> state.getValue(NatlanRainbowSanctumLeylineSpawnerBlock.PHASE).lightLevel())
                .strength(50.0F, 1200.0F)
                .sound(SoundType.METAL)
                .isViewBlocking((state, level, pos) -> false)
                .noOcclusion()
                .requiresCorrectToolForDrops());
    }

    private static NodKraiMoonchildsTreasuresLeylineSpawnerBlock createNodKraiMoonchildsTreasuresLeylineSpawnerBlock() {
        return new NodKraiMoonchildsTreasuresLeylineSpawnerBlock(BlockBehaviour.Properties.of()
                .lightLevel(state -> state.getValue(NodKraiMoonchildsTreasuresLeylineSpawnerBlock.PHASE).lightLevel())
                .strength(50.0F, 1200.0F)
                .sound(SoundType.METAL)
                .isViewBlocking((state, level, pos) -> false)
                .noOcclusion()
                .requiresCorrectToolForDrops());
    }

    private static NodKraiFrostladenMachineryLeylineSpawnerBlock createNodKraiFrostladenMachineryLeylineSpawnerBlock() {
        return new NodKraiFrostladenMachineryLeylineSpawnerBlock(BlockBehaviour.Properties.of()
                .lightLevel(state -> state.getValue(NodKraiFrostladenMachineryLeylineSpawnerBlock.PHASE).lightLevel())
                .strength(50.0F, 1200.0F)
                .sound(SoundType.METAL)
                .isViewBlocking((state, level, pos) -> false)
                .noOcclusion()
                .requiresCorrectToolForDrops());
    }

    private static SnezhnayaInvertedGlacierLeylineSpawnerBlock createSnezhnayaInvertedGlacierLeylineSpawnerBlock() {
        return new SnezhnayaInvertedGlacierLeylineSpawnerBlock(BlockBehaviour.Properties.of()
                .lightLevel(state -> state.getValue(SnezhnayaInvertedGlacierLeylineSpawnerBlock.PHASE).lightLevel())
                .strength(50.0F, 1200.0F)
                .sound(SoundType.METAL)
                .isViewBlocking((state, level, pos) -> false)
                .noOcclusion()
                .requiresCorrectToolForDrops());
    }

    public static void register(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        BLOCK_ENTITY_TYPES.register(modEventBus);
        FEATURES.register(modEventBus);
    }
}
