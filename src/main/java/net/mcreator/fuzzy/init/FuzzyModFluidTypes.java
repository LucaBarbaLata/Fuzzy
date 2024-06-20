
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fuzzy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.fuzzy.fluid.types.CutiFluidType;
import net.mcreator.fuzzy.FuzzyMod;

public class FuzzyModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, FuzzyMod.MODID);
	public static final RegistryObject<FluidType> CUTI_TYPE = REGISTRY.register("cuti", () -> new CutiFluidType());
}
