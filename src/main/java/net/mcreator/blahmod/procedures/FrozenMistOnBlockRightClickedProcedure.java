package net.mcreator.blahmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.blahmod.init.BlahmodModItems;
import net.mcreator.blahmod.init.BlahmodModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FrozenMistOnBlockRightClickedProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double localRaytraceDistance = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BUCKET) {
			localRaytraceDistance = 0.5;
			for (int index0 = 0; index0 < (int) (5); index0++) {
				if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == BlahmodModBlocks.FROZEN_MIST.get()) {
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					world.setBlock(
							new BlockPos(
									entity.level.clip(new ClipContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(localRaytraceDistance)),
											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),
									entity.level.clip(new ClipContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(localRaytraceDistance)),
											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),
									entity.level.clip(new ClipContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(localRaytraceDistance)),
											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
							Blocks.AIR.defaultBlockState(), 3);
					if (!world.isClientSide()) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null,
										new BlockPos(
												entity.level.clip(new ClipContext(entity.getEyePosition(1f),
														entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(localRaytraceDistance)),
														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),
												entity.level.clip(new ClipContext(entity.getEyePosition(1f),
														entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(localRaytraceDistance)),
														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),
												entity.level.clip(new ClipContext(entity.getEyePosition(1f),
														entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(localRaytraceDistance)),
														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.powder_snow.break")), SoundSource.NEUTRAL,
										1, 1);
							} else {
								_level.playLocalSound(
										(entity.level.clip(new ClipContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(localRaytraceDistance)),
												ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
										(entity.level.clip(new ClipContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(localRaytraceDistance)),
												ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
										(entity.level.clip(new ClipContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(localRaytraceDistance)),
												ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.powder_snow.break")), SoundSource.NEUTRAL,
										1, 1, false);
							}
						}
					}
					if ((new Object() {
						public boolean checkGamemode(Entity _ent) {
							if (_ent instanceof ServerPlayer _serverPlayer) {
								return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
							} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
								return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
										&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId())
												.getGameMode() == GameType.CREATIVE;
							}
							return false;
						}
					}.checkGamemode(entity)) == false) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(Items.BUCKET);
							_setstack.setCount(
									(int) (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getCount() - 1));
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(BlahmodModItems.FROZEN_MIST_BUCKET.get());
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(BlahmodModItems.FROZEN_MIST_BUCKET.get());
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
						}
					}
					world.destroyBlock(new BlockPos(x, y, z), false);
					break;
				}
				localRaytraceDistance = localRaytraceDistance + 1;
			}
		}
	}
}
