package net.mcreator.blahmod.procedures;

import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.blahmod.init.BlahmodModMobEffects;

public class SlowInMoltenIceProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(BlahmodModMobEffects.WARMTH.get()) : false)) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 4, (false), (true)));
			if (!(entity instanceof LivingEntity _livEnt ? _livEnt.getMobType() == MobType.UNDEAD : false)
					&& !(entity instanceof LivingEntity _livEnt ? _livEnt.getMobType() == MobType.ARTHROPOD : false)) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(BlahmodModMobEffects.FREEZING.get(), 120, 2, (false), (false)));
			}
		}
	}
}
