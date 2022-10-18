
package net.mcreator.blahmod.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.blahmod.procedures.FreezingTickProcedure;

public class FreezingMobEffect extends MobEffect {
	public FreezingMobEffect() {
		super(MobEffectCategory.HARMFUL, -16711681);
	}

	@Override
	public String getDescriptionId() {
		return "effect.blahmod.freezing";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		FreezingTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
