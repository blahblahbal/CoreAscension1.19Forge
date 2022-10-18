package net.mcreator.blahmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

import net.mcreator.blahmod.init.BlahmodModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class NetherCoreFreezeWaterProcedure {
	@SubscribeEvent
	public static void onBlockUpdate(BlockEvent.NeighborNotifyEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ());
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		if ((world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == (ResourceKey.create(Registry.DIMENSION_REGISTRY,
				new ResourceLocation("blahmod:nether_core")))) {
			if ((world.getFluidState(new BlockPos(x, y, z)).createLegacyBlock()).getBlock() == Blocks.WATER) {
				world.setBlock(new BlockPos(x, y, z), BlahmodModBlocks.PERMA_ICE.get().defaultBlockState(), 3);
			}
		}
	}
}
