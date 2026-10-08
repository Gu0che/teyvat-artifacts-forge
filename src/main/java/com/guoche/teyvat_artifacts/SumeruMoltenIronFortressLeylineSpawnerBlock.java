package com.guoche.teyvat_artifacts;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.BlockHitResult;

import org.jetbrains.annotations.Nullable;

public class SumeruMoltenIronFortressLeylineSpawnerBlock extends BaseEntityBlock {
    public static final EnumProperty<MondstadtLeylineSpawnerPhase> PHASE = EnumProperty.create("phase", MondstadtLeylineSpawnerPhase.class);

    public SumeruMoltenIronFortressLeylineSpawnerBlock(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(PHASE, MondstadtLeylineSpawnerPhase.READY));
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new SumeruMoltenIronFortressLeylineSpawnerBlockEntity(pos, state);
    }

    @Override
    public @Nullable <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
        if (level.isClientSide) {
            return createTickerHelper(type, LeylineSpawnerContent.SUMERU_MOLTEN_IRON_FORTRESS_LEYLINE_SPAWNER_BLOCK_ENTITY.get(), SumeruMoltenIronFortressLeylineSpawnerBlockEntity::clientTick);
        }

        return createTickerHelper(type, LeylineSpawnerContent.SUMERU_MOLTEN_IRON_FORTRESS_LEYLINE_SPAWNER_BLOCK_ENTITY.get(), SumeruMoltenIronFortressLeylineSpawnerBlockEntity::serverTick);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        if (level.isClientSide) {
            return InteractionResult.SUCCESS;
        }

        ItemStack heldStack = player.getItemInHand(hand);
        return handleInteraction(level, pos, player, heldStack) ? InteractionResult.CONSUME : InteractionResult.PASS;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<net.minecraft.world.level.block.Block, BlockState> builder) {
        builder.add(PHASE);
    }

    @Override
    public void onRemove(BlockState state, Level level, BlockPos pos, BlockState newState, boolean movedByPiston) {
        if (!state.is(newState.getBlock())) {
            BlockEntity blockEntity = level.getBlockEntity(pos);
            if (blockEntity instanceof SumeruMoltenIronFortressLeylineSpawnerBlockEntity spawner && level instanceof net.minecraft.server.level.ServerLevel serverLevel) {
                spawner.discardTrackedMobs(serverLevel);
            }
        }

        super.onRemove(state, level, pos, newState, movedByPiston);
    }

    private boolean handleInteraction(Level level, BlockPos pos, Player player, ItemStack heldStack) {
        BlockEntity blockEntity = level.getBlockEntity(pos);
        if (!(blockEntity instanceof SumeruMoltenIronFortressLeylineSpawnerBlockEntity spawner)) {
            return false;
        }

        return spawner.handleInteraction(player, heldStack);
    }
}
