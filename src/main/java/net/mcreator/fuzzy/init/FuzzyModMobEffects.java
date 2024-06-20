
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fuzzy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.fuzzy.potion.CutenessMobEffect;
import net.mcreator.fuzzy.FuzzyMod;

public class FuzzyModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, FuzzyMod.MODID);
	public static final RegistryObject<MobEffect> CUTENESS = REGISTRY.register("cuteness", () -> new CutenessMobEffect());
}
