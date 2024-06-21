package net.mcreator.fuzzy.procedures;

import net.minecraftforge.eventbus.api.Event;

public class BlueApplePlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2400, 3));
	}
}
