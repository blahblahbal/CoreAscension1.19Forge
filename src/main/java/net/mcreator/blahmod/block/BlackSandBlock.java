
package net.mcreator.blahmod.block;

import net.minecraftforge.common.IPlantable;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Collections;
import net.minecraftforge.common.PlantType;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

public class BlackSandBlock extends FallingBlock {
	public BlackSandBlock() {
		super(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_BLACK).sound(SoundType.SAND).strength(0.5f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction direction, IPlantable plantable)
	{
		final BlockPos plantPos = new BlockPos(pos.getX(), pos.getY() + 1, pos.getZ());
		final PlantType plantType = plantable.getPlantType(world, plantPos);
		if (plantType == PlantType.DESERT)
		{
			return true;
		}
		else if (plantType == PlantType.BEACH)
		{
			return ((world.getBlockState(pos.east()).getMaterial() == Material.WATER || world.getBlockState(pos.east()).hasProperty(BlockStateProperties.WATERLOGGED))
				|| (world.getBlockState(pos.west()).getMaterial() == Material.WATER || world.getBlockState(pos.west()).hasProperty(BlockStateProperties.WATERLOGGED))
				|| (world.getBlockState(pos.north()).getMaterial() == Material.WATER || world.getBlockState(pos.north()).hasProperty(BlockStateProperties.WATERLOGGED))
				|| (world.getBlockState(pos.south()).getMaterial() == Material.WATER || world.getBlockState(pos.south()).hasProperty(BlockStateProperties.WATERLOGGED)));
		}
		else
		{
			return false;
		}
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}
