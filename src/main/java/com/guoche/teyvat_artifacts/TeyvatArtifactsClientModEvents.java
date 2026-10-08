package com.guoche.teyvat_artifacts;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = TeyvatArtifacts.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class TeyvatArtifactsClientModEvents {
    private TeyvatArtifactsClientModEvents() {
    }

    @SubscribeEvent
    public static void registerConfigScreen(FMLClientSetupEvent event) {
        if (!net.minecraftforge.fml.ModList.get().isLoaded("cloth_config")) return;
        net.minecraftforge.fml.ModList.get().getModContainerById(TeyvatArtifacts.MODID).orElseThrow()
                .registerExtensionPoint(net.minecraftforge.client.ConfigScreenHandler.ConfigScreenFactory.class,
                        () -> new net.minecraftforge.client.ConfigScreenHandler.ConfigScreenFactory(
                                parent -> ArtifactClothConfigScreen.create(parent)));
    }

    @SubscribeEvent
    public static void registerAlchemyScreen(FMLClientSetupEvent event) {
        event.enqueueWork(() -> net.minecraft.client.gui.screens.MenuScreens.register(
                AlchemyTableContent.MENU.get(), AlchemyTableScreen::new));
    }

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.<Crystalfly>registerEntityRenderer(TeyvatArtifacts.ANEMO_CRYSTALFLY.get(), CrystalflyRenderer::new);
        event.<Crystalfly>registerEntityRenderer(TeyvatArtifacts.ICE_CRYSTALFLY.get(), CrystalflyRenderer::new);
        event.<Crystalfly>registerEntityRenderer(TeyvatArtifacts.GEO_CRYSTALFLY.get(), CrystalflyRenderer::new);
        event.<Crystalfly>registerEntityRenderer(TeyvatArtifacts.ELECTRO_CRYSTALFLY.get(), CrystalflyRenderer::new);
        event.<Crystalfly>registerEntityRenderer(TeyvatArtifacts.DENDRO_CRYSTALFLY.get(), CrystalflyRenderer::new);
        event.<Crystalfly>registerEntityRenderer(TeyvatArtifacts.HYDRO_CRYSTALFLY.get(), CrystalflyRenderer::new);
        event.<Crystalfly>registerEntityRenderer(TeyvatArtifacts.PYRO_CRYSTALFLY.get(), CrystalflyRenderer::new);
        event.registerBlockEntityRenderer(
                LeylineSpawnerContent.MONDSTADT_LEYLINE_SPAWNER_BLOCK_ENTITY.get(),
                MondstadtLeylineSpawnerRenderer::new
        );
        event.registerBlockEntityRenderer(
                LeylineSpawnerContent.LIYUE_CLEAR_POOL_LEYLINE_SPAWNER_BLOCK_ENTITY.get(),
                LiyueClearPoolLeylineSpawnerRenderer::new
        );
        event.registerBlockEntityRenderer(
                LeylineSpawnerContent.MONDSTADT_RIDGE_WATCH_LEYLINE_SPAWNER_BLOCK_ENTITY.get(),
                MondstadtRidgeWatchLeylineSpawnerRenderer::new
        );
        event.registerBlockEntityRenderer(
                LeylineSpawnerContent.MONDSTADT_THORNY_CROWN_LEYLINE_SPAWNER_BLOCK_ENTITY.get(),
                MondstadtThornyCrownLeylineSpawnerRenderer::new
        );
        event.registerBlockEntityRenderer(
                LeylineSpawnerContent.MONDSTADT_PEAK_VINDAGNYR_LEYLINE_SPAWNER_BLOCK_ENTITY.get(),
                MondstadtPeakVindagnyrLeylineSpawnerRenderer::new
        );
        event.registerBlockEntityRenderer(
                LeylineSpawnerContent.MONDSTADT_VALLEY_REMEMBRANCE_LEYLINE_SPAWNER_BLOCK_ENTITY.get(),
                MondstadtValleyRemembranceLeylineSpawnerRenderer::new
        );
        event.registerBlockEntityRenderer(
                LeylineSpawnerContent.LIYUE_DOMAIN_GUYUN_LEYLINE_SPAWNER_BLOCK_ENTITY.get(),
                LiyueDomainGuyunLeylineSpawnerRenderer::new
        );
        event.registerBlockEntityRenderer(
                LeylineSpawnerContent.LIYUE_LOST_VALLEY_LEYLINE_SPAWNER_BLOCK_ENTITY.get(),
                LiyueLostValleyLeylineSpawnerRenderer::new
        );
        event.registerBlockEntityRenderer(
                LeylineSpawnerContent.LIYUE_ZHOU_FORMULA_LEYLINE_SPAWNER_BLOCK_ENTITY.get(),
                LiyueZhouFormulaLeylineSpawnerRenderer::new
        );
        event.registerBlockEntityRenderer(
                LeylineSpawnerContent.INAZUMA_MOMIJI_DYED_COURT_LEYLINE_SPAWNER_BLOCK_ENTITY.get(),
                InazumaMomijiDyedCourtLeylineSpawnerRenderer::new
        );
        event.registerBlockEntityRenderer(
                LeylineSpawnerContent.INAZUMA_SLUMBERING_COURT_LEYLINE_SPAWNER_BLOCK_ENTITY.get(),
                InazumaSlumberingCourtLeylineSpawnerRenderer::new
        );
        event.registerBlockEntityRenderer(
                LeylineSpawnerContent.SUMERU_MOLTEN_IRON_FORTRESS_LEYLINE_SPAWNER_BLOCK_ENTITY.get(),
                SumeruMoltenIronFortressLeylineSpawnerRenderer::new
        );
        event.registerBlockEntityRenderer(
                LeylineSpawnerContent.SUMERU_SOLITARY_ENLIGHTENMENT_LEYLINE_SPAWNER_BLOCK_ENTITY.get(),
                SumeruSolitaryEnlightenmentLeylineSpawnerRenderer::new
        );
        event.registerBlockEntityRenderer(
                LeylineSpawnerContent.SUMERU_CITY_GOLD_LEYLINE_SPAWNER_BLOCK_ENTITY.get(),
                SumeruCityGoldLeylineSpawnerRenderer::new
        );
        event.registerBlockEntityRenderer(
                LeylineSpawnerContent.FONTAINE_WATERFALL_WEN_LEYLINE_SPAWNER_BLOCK_ENTITY.get(),
                FontaineWaterfallWenLeylineSpawnerRenderer::new
        );
        event.registerBlockEntityRenderer(
                LeylineSpawnerContent.FONTAINE_DENOUEMENT_SIN_LEYLINE_SPAWNER_BLOCK_ENTITY.get(),
                FontaineDenouementSinLeylineSpawnerRenderer::new
        );
        event.registerBlockEntityRenderer(
                LeylineSpawnerContent.FONTAINE_FADED_THEATER_LEYLINE_SPAWNER_BLOCK_ENTITY.get(),
                FontaineFadedTheaterLeylineSpawnerRenderer::new
        );
        event.registerBlockEntityRenderer(
                LeylineSpawnerContent.NATLAN_DERELICT_MASONRY_DOCK_LEYLINE_SPAWNER_BLOCK_ENTITY.get(),
                NatlanDerelictMasonryDockLeylineSpawnerRenderer::new
        );
        event.registerBlockEntityRenderer(
                LeylineSpawnerContent.NATLAN_RAINBOW_SANCTUM_LEYLINE_SPAWNER_BLOCK_ENTITY.get(),
                NatlanRainbowSanctumLeylineSpawnerRenderer::new
        );
        event.registerBlockEntityRenderer(
                LeylineSpawnerContent.NOD_KRAI_MOONCHILDS_TREASURES_LEYLINE_SPAWNER_BLOCK_ENTITY.get(),
                NodKraiMoonchildsTreasuresLeylineSpawnerRenderer::new
        );
        event.registerBlockEntityRenderer(
                LeylineSpawnerContent.NOD_KRAI_FROSTLADEN_MACHINERY_LEYLINE_SPAWNER_BLOCK_ENTITY.get(),
                NodKraiFrostladenMachineryLeylineSpawnerRenderer::new
        );
        event.registerBlockEntityRenderer(
                LeylineSpawnerContent.SNEZHNAYA_INVERTED_GLACIER_LEYLINE_SPAWNER_BLOCK_ENTITY.get(),
                SnezhnayaInvertedGlacierLeylineSpawnerRenderer::new
        );
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(CrystalflyModel.LAYER_LOCATION, CrystalflyModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ItemBlockRenderTypes.setRenderLayer(
                    LeylineSpawnerContent.MONDSTADT_LEYLINE_SPAWNER.get(),
                    RenderType.cutout()
            );
            ItemBlockRenderTypes.setRenderLayer(
                    LeylineSpawnerContent.LIYUE_CLEAR_POOL_LEYLINE_SPAWNER.get(),
                    RenderType.cutout()
            );
            ItemBlockRenderTypes.setRenderLayer(
                    LeylineSpawnerContent.MONDSTADT_RIDGE_WATCH_LEYLINE_SPAWNER.get(),
                    RenderType.cutout()
            );
            ItemBlockRenderTypes.setRenderLayer(
                    LeylineSpawnerContent.MONDSTADT_THORNY_CROWN_LEYLINE_SPAWNER.get(),
                    RenderType.cutout()
            );
            ItemBlockRenderTypes.setRenderLayer(
                    LeylineSpawnerContent.MONDSTADT_PEAK_VINDAGNYR_LEYLINE_SPAWNER.get(),
                    RenderType.cutout()
            );
            ItemBlockRenderTypes.setRenderLayer(
                    LeylineSpawnerContent.MONDSTADT_VALLEY_REMEMBRANCE_LEYLINE_SPAWNER.get(),
                    RenderType.cutout()
            );
            ItemBlockRenderTypes.setRenderLayer(
                    LeylineSpawnerContent.LIYUE_DOMAIN_GUYUN_LEYLINE_SPAWNER.get(),
                    RenderType.cutout()
            );
            ItemBlockRenderTypes.setRenderLayer(
                    LeylineSpawnerContent.LIYUE_LOST_VALLEY_LEYLINE_SPAWNER.get(),
                    RenderType.cutout()
            );
            ItemBlockRenderTypes.setRenderLayer(
                    LeylineSpawnerContent.LIYUE_ZHOU_FORMULA_LEYLINE_SPAWNER.get(),
                    RenderType.cutout()
            );
            ItemBlockRenderTypes.setRenderLayer(
                    LeylineSpawnerContent.INAZUMA_MOMIJI_DYED_COURT_LEYLINE_SPAWNER.get(),
                    RenderType.cutout()
            );
            ItemBlockRenderTypes.setRenderLayer(
                    LeylineSpawnerContent.INAZUMA_SLUMBERING_COURT_LEYLINE_SPAWNER.get(),
                    RenderType.cutout()
            );
            ItemBlockRenderTypes.setRenderLayer(
                    LeylineSpawnerContent.SUMERU_MOLTEN_IRON_FORTRESS_LEYLINE_SPAWNER.get(),
                    RenderType.cutout()
            );
            ItemBlockRenderTypes.setRenderLayer(
                    LeylineSpawnerContent.SUMERU_SOLITARY_ENLIGHTENMENT_LEYLINE_SPAWNER.get(),
                    RenderType.cutout()
            );
            ItemBlockRenderTypes.setRenderLayer(
                    LeylineSpawnerContent.SUMERU_CITY_GOLD_LEYLINE_SPAWNER.get(),
                    RenderType.cutout()
            );
            ItemBlockRenderTypes.setRenderLayer(
                    LeylineSpawnerContent.FONTAINE_WATERFALL_WEN_LEYLINE_SPAWNER.get(),
                    RenderType.cutout()
            );
            ItemBlockRenderTypes.setRenderLayer(
                    LeylineSpawnerContent.FONTAINE_DENOUEMENT_SIN_LEYLINE_SPAWNER.get(),
                    RenderType.cutout()
            );
            ItemBlockRenderTypes.setRenderLayer(
                    LeylineSpawnerContent.FONTAINE_FADED_THEATER_LEYLINE_SPAWNER.get(),
                    RenderType.cutout()
            );
            ItemBlockRenderTypes.setRenderLayer(
                    LeylineSpawnerContent.NATLAN_DERELICT_MASONRY_DOCK_LEYLINE_SPAWNER.get(),
                    RenderType.cutout()
            );
            ItemBlockRenderTypes.setRenderLayer(
                    LeylineSpawnerContent.NATLAN_RAINBOW_SANCTUM_LEYLINE_SPAWNER.get(),
                    RenderType.cutout()
            );
            ItemBlockRenderTypes.setRenderLayer(
                    LeylineSpawnerContent.NOD_KRAI_MOONCHILDS_TREASURES_LEYLINE_SPAWNER.get(),
                    RenderType.cutout()
            );
            ItemBlockRenderTypes.setRenderLayer(
                    LeylineSpawnerContent.NOD_KRAI_FROSTLADEN_MACHINERY_LEYLINE_SPAWNER.get(),
                    RenderType.cutout()
            );
            ItemBlockRenderTypes.setRenderLayer(
                    LeylineSpawnerContent.SNEZHNAYA_INVERTED_GLACIER_LEYLINE_SPAWNER.get(),
                    RenderType.cutout()
            );
        });
    }
}
