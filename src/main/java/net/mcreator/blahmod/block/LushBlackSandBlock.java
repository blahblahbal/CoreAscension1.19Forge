
package net.mcreator.blahmod.block;

import net.minecraftforge.common.IPlantable;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.BiomeColors;

import net.mcreator.blahmod.procedures.LushBlackSandProProcedure;
import net.mcreator.blahmod.init.BlahmodModBlocks;
import net.minecraftforge.common.PlantType;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

public class LushBlackSandBlock extends Block {
	public LushBlackSandBlock() {
		super(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.GRASS).sound(SoundType.SAND).strength(0.5f).randomTicks());
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
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();

		LushBlackSandProProcedure.execute(world, x, y, z);
	}

	@OnlyIn(Dist.CLIENT)
	public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
		event.getBlockColors().register((bs, world, pos, index) -> {
			return world != null && pos != null ? BiomeColors.getAverageGrassColor(world, pos) : GrassColor.get(0.5D, 1.0D);
		}, BlahmodModBlocks.LUSH_BLACK_SAND.get());
	}

	@OnlyIn(Dist.CLIENT)
	public static void itemColorLoad(RegisterColorHandlersEvent.Item event) {
		event.getItemColors().register((stack, index) -> {
			return GrassColor.get(0.5D, 1.0D);
		}, BlahmodModBlocks.LUSH_BLACK_SAND.get());
	}
}
