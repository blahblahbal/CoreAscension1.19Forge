
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blahmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.blahmod.block.TropicsPlanksBlock;
import net.mcreator.blahmod.block.TropicsLogBlock;
import net.mcreator.blahmod.block.TropicsLeavesBlock;
import net.mcreator.blahmod.block.BlackSandstoneBlock;
import net.mcreator.blahmod.block.BlackSandBlock;
import net.mcreator.blahmod.BlahmodMod;

public class BlahmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BlahmodMod.MODID);
	public static final RegistryObject<Block> BLACK_SAND = REGISTRY.register("black_sand", () -> new BlackSandBlock());
	public static final RegistryObject<Block> TROPICS_LOG = REGISTRY.register("tropics_log", () -> new TropicsLogBlock());
	public static final RegistryObject<Block> TROPICS_PLANKS = REGISTRY.register("tropics_planks", () -> new TropicsPlanksBlock());
	public static final RegistryObject<Block> TROPICS_LEAVES = REGISTRY.register("tropics_leaves", () -> new TropicsLeavesBlock());
	public static final RegistryObject<Block> BLACK_SANDSTONE = REGISTRY.register("black_sandstone", () -> new BlackSandstoneBlock());
}
