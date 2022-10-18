package net.mcreator.blahmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
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

import net.mcreator.blahmod.init.BlahmodModBlocks;

public class FrozenMistBucketRightClickOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.WATER
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.WATER
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.BUBBLE_COLUMN
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			world.setBlock(new BlockPos(x, y + 1, z), BlahmodModBlocks.FROZEN_MIST.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				if (Math.random() > 0.5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y + 1, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.powder_snow.place")), SoundSource.NEUTRAL, 1,
									1);
						} else {
							_level.playLocalSound(x, (y + 1), z,
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.powder_snow.place")), SoundSource.NEUTRAL, 1, 1,
									false);
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y + 1, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.powder_snow.place")), SoundSource.NEUTRAL, 1,
									(float) 0.9);
						} else {
							_level.playLocalSound(x, (y + 1), z,
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.powder_snow.place")), SoundSource.NEUTRAL, 1,
									(float) 0.9, false);
						}
					}
				}
			}
			if ((new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
					} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft
								.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
					}
					return false;
				}
			}.checkGamemode(entity)) == false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.BUCKET);
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			}
		}
	}
}
