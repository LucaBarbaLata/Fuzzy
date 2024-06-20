
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fuzzy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.item.ItemProperties;

import net.mcreator.fuzzy.item.StrawberrysItem;
import net.mcreator.fuzzy.item.CutiItem;
import net.mcreator.fuzzy.item.CuteCreaturesItem;
import net.mcreator.fuzzy.item.CirozaItem;
import net.mcreator.fuzzy.FuzzyMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FuzzyModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FuzzyMod.MODID);
	public static final RegistryObject<Item> CUTI_BUCKET = REGISTRY.register("cuti_bucket", () -> new CutiItem());
	public static final RegistryObject<Item> CIROZA = REGISTRY.register("ciroza", () -> new CirozaItem());
	public static final RegistryObject<Item> CUTE_CREATURES = REGISTRY.register("cute_creatures", () -> new CuteCreaturesItem());
	public static final RegistryObject<Item> STRAWBERRYS = REGISTRY.register("strawberrys", () -> new StrawberrysItem());

	// Start of user code block custom items
	// End of user code block custom items
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			ItemProperties.register(CIROZA.get(), new ResourceLocation("blocking"), ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
		});
	}
}
