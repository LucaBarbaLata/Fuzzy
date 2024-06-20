
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fuzzy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.fuzzy.block.CutiBlock;
import net.mcreator.fuzzy.FuzzyMod;

public class FuzzyModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FuzzyMod.MODID);
	public static final RegistryObject<Block> CUTI = REGISTRY.register("cuti", () -> new CutiBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
