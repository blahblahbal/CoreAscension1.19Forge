package net.mcreator.blahmod.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.blahmod.init.BlahmodModBlocks;

public class NetherCoreGroveAirUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double ypos = 0;
		double rn1 = 0;
		double sx = 0;
		double aircount = 0;
		double sy = 0;
		double sz = 0;
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == BlahmodModBlocks.CORE_NYLIUM.get()) {
			if (Math.random() < 0.015) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("blahmod", "core_roots"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(x, y, z), new BlockPos(x, y, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
			if (Math.random() < 0.002) {
				world.setBlock(new BlockPos(x, y, z), BlahmodModBlocks.CORE_FUNGUS.get().defaultBlockState(), 3);
			}
			if (Math.random() < 0.00075) {
				CoreVineGroundVineThingProcedure.execute(world, x, y, z);
			}
			sx = -4;
			found = false;
			for (int index0 = 0; index0 < (int) (7); index0++) {
				sy = -5;
				for (int index1 = 0; index1 < (int) (10); index1++) {
					sz = -4;
					for (int index2 = 0; index2 < (int) (7); index2++) {
						if ((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz))).getBlock() == Blocks.AIR) {
							aircount = aircount + 1;
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
			if (Math.random() < 0.00075) {
				if (aircount > 100) {
					rn1 = Math.random();
					ypos = y - 1;
					while ((world.getBlockState(new BlockPos(x, ypos, z))).getBlock() == Blocks.AIR) {
						ypos = ypos - 1;
						if ((world.getBlockState(new BlockPos(x, ypos, z))).getBlock() == BlahmodModBlocks.CORE_NYLIUM.get()) {
							break;
						}
					}
					if (!((world.getBlockState(new BlockPos(x, ypos, z))).getBlock() == BlahmodModBlocks.MOLTEN_ICE.get())) {
						if (rn1 < 0.25) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(new ResourceLocation("blahmod", "small_core_tree"));
								if (template != null) {
									template.placeInWorld(_serverworld, new BlockPos(x - 3, y, z - 3), new BlockPos(x - 3, y, z - 3),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (rn1 < 0.5) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(new ResourceLocation("blahmod", "small_core_tree"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, new BlockPos(x - 3, y, z - 3), new BlockPos(x - 3, y, z - 3), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (rn1 < 0.75) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(new ResourceLocation("blahmod", "small_core_tree"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, new BlockPos(x - 3, y, z - 3), new BlockPos(x - 3, y, z - 3), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(new ResourceLocation("blahmod", "small_core_tree"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, new BlockPos(x - 3, y, z - 3), new BlockPos(x - 3, y, z - 3), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					}
				} else if (aircount > 200) {
					rn1 = Math.random();
					ypos = y - 1;
					while ((world.getBlockState(new BlockPos(x, ypos, z))).getBlock() == Blocks.AIR) {
						ypos = ypos - 1;
						if ((world.getBlockState(new BlockPos(x, ypos, z))).getBlock() == BlahmodModBlocks.CORE_NYLIUM.get()) {
							break;
						}
					}
					if (!((world.getBlockState(new BlockPos(x, ypos, z))).getBlock() == BlahmodModBlocks.MOLTEN_ICE.get())) {
						if (rn1 < 0.25) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(new ResourceLocation("blahmod", "core_tree"));
								if (template != null) {
									template.placeInWorld(_serverworld, new BlockPos(x - 3, y, z - 3), new BlockPos(x - 3, y, z - 3),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (rn1 < 0.5) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(new ResourceLocation("blahmod", "core_tree"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, new BlockPos(x - 3, y, z - 3), new BlockPos(x - 3, y, z - 3), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (rn1 < 0.75) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(new ResourceLocation("blahmod", "core_tree"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, new BlockPos(x - 3, y, z - 3), new BlockPos(x - 3, y, z - 3), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(new ResourceLocation("blahmod", "core_tree"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, new BlockPos(x - 3, y, z - 3), new BlockPos(x - 3, y, z - 3), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					}
				}
			}
		}
	}
}
