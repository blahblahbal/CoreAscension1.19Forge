package net.mcreator.blahmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

public class NetherCoreCanMakePortalProcedure {
	public static boolean execute(LevelAccessor world) {
		return (world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == (Level.NETHER)
				|| (world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == (ResourceKey.create(Registry.DIMENSION_REGISTRY,
						new ResourceLocation("blahmod:nether_core")));
	}
}
