
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fuzzy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.fuzzy.item.StrawberrysItem;
import net.mcreator.fuzzy.item.CutiItem;
import net.mcreator.fuzzy.item.CuteCreaturesItem;
import net.mcreator.fuzzy.FuzzyMod;

public class FuzzyModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FuzzyMod.MODID);
	public static final RegistryObject<Item> CUTI_BUCKET = REGISTRY.register("cuti_bucket", () -> new CutiItem());
	public static final RegistryObject<Item> CUTE_CREATURES = REGISTRY.register("cute_creatures", () -> new CuteCreaturesItem());
	public static final RegistryObject<Item> STRAWBERRYS = REGISTRY.register("strawberrys", () -> new StrawberrysItem());
	// Start of user code block custom items
	// End of user code block custom items
}
