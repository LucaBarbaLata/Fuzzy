
package net.mcreator.fuzzy.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class CutenessMobEffect extends MobEffect {
	public CutenessMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -6750004);
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
