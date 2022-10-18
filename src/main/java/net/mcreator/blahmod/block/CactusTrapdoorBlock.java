
package net.mcreator.blahmod.block;

import net.minecraftforge.common.util.ForgeSoundType;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Collections;

public class CactusTrapdoorBlock extends TrapDoorBlock {
	public CactusTrapdoorBlock() {
		super(BlockBehaviour.Properties.of(Material.WOOD)
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> new SoundEvent(new ResourceLocation("blahmod:cactus_planks_break")),
						() -> new SoundEvent(new ResourceLocation("blahmod:cactus_planks_step")),
						() -> new SoundEvent(new ResourceLocation("blahmod:cactus_planks_place")),
						() -> new SoundEvent(new ResourceLocation("blahmod:cactus_planks_hit")),
						() -> new SoundEvent(new ResourceLocation("blahmod:cactus_planks_step"))))
				.strength(2f, 3f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).dynamicShape());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}
