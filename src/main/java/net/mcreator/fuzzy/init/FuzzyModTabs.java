
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fuzzy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.fuzzy.FuzzyMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FuzzyModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FuzzyMod.MODID);
	public static final RegistryObject<CreativeModeTab> FUZZY = REGISTRY.register("fuzzy",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.fuzzy.fuzzy")).icon(() -> new ItemStack(Blocks.SLIME_BLOCK)).displayItems((parameters, tabData) -> {
				tabData.accept(FuzzyModItems.CUTI_BUCKET.get());
				tabData.accept(FuzzyModItems.CIROZA.get());
				tabData.accept(FuzzyModItems.CUTE_CREATURES.get());
				tabData.accept(FuzzyModItems.STRAWBERRYS.get());
				tabData.accept(FuzzyModItems.STARRY_ARMOR_HELMET.get());
				tabData.accept(FuzzyModItems.STARRY_ARMOR_CHESTPLATE.get());
				tabData.accept(FuzzyModItems.STARRY_ARMOR_LEGGINGS.get());
				tabData.accept(FuzzyModItems.STARRY_ARMOR_BOOTS.get());
				tabData.accept(FuzzyModItems.LYCHEE.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(FuzzyModItems.BIANAL_SPAWN_EGG.get());
			tabData.accept(FuzzyModItems.LABUSHA_SPAWN_EGG.get());
			tabData.accept(FuzzyModItems.MOSSHEEP_SPAWN_EGG.get());
		}
	}
}
