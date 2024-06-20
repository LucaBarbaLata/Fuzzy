
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fuzzy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.fuzzy.FuzzyMod;

public class FuzzyModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, FuzzyMod.MODID);
	public static final RegistryObject<SoundEvent> CUTECREATURES = REGISTRY.register("cutecreatures", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("fuzzy", "cutecreatures")));
}
