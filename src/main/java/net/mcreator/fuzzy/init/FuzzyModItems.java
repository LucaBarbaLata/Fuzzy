
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
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.item.ItemProperties;

import net.mcreator.fuzzy.item.StrawberrysItem;
import net.mcreator.fuzzy.item.StarryArmorItem;
import net.mcreator.fuzzy.item.LycheeItem;
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
	public static final RegistryObject<Item> STARRY_ARMOR_HELMET = REGISTRY.register("starry_armor_helmet", () -> new StarryArmorItem.Helmet());
	public static final RegistryObject<Item> STARRY_ARMOR_CHESTPLATE = REGISTRY.register("starry_armor_chestplate", () -> new StarryArmorItem.Chestplate());
	public static final RegistryObject<Item> STARRY_ARMOR_LEGGINGS = REGISTRY.register("starry_armor_leggings", () -> new StarryArmorItem.Leggings());
	public static final RegistryObject<Item> STARRY_ARMOR_BOOTS = REGISTRY.register("starry_armor_boots", () -> new StarryArmorItem.Boots());
	public static final RegistryObject<Item> LYCHEE = REGISTRY.register("lychee", () -> new LycheeItem());
	public static final RegistryObject<Item> BIANAL_SPAWN_EGG = REGISTRY.register("bianal_spawn_egg", () -> new ForgeSpawnEggItem(FuzzyModEntities.BIANAL, -13108, -52276, new Item.Properties()));

	// Start of user code block custom items
	// End of user code block custom items
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			ItemProperties.register(CIROZA.get(), new ResourceLocation("blocking"), ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
		});
	}
}
