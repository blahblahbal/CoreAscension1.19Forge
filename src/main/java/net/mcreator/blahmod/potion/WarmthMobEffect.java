
package net.mcreator.blahmod.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class WarmthMobEffect extends MobEffect {
	public WarmthMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -39424);
	}

	@Override
	public String getDescriptionId() {
		return "effect.blahmod.warmth";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
