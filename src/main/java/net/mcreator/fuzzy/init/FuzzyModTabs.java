
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fuzzy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.fuzzy.FuzzyMod;

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
				tabData.accept(FuzzyModItems.BIANAL_SPAWN_EGG.get());
				tabData.accept(FuzzyModItems.LABUSHA_SPAWN_EGG.get());
				tabData.accept(FuzzyModItems.MOSSHEEP_SPAWN_EGG.get());
				tabData.accept(FuzzyModItems.MOSSY_BEEF.get());
				tabData.accept(FuzzyModItems.BLUE_APPLE.get());
				tabData.accept(FuzzyModItems.MINT.get());
				tabData.accept(FuzzyModItems.BLOCKERS_CANDY_BAR.get());
				tabData.accept(FuzzyModItems.OREO_6X_BISCUITS.get());
				tabData.accept(FuzzyModItems.LAGS_CHIPS.get());
				tabData.accept(FuzzyModItems.CHIP.get());
				tabData.accept(FuzzyModItems.BLACK_BREAD.get());
				tabData.accept(FuzzyModItems.OREO.get());
				tabData.accept(FuzzyModItems.CHOCO_BAR.get());
				tabData.accept(FuzzyModItems.MOSSY_STEAK.get());
				tabData.accept(FuzzyModItems.PENCIL.get());
				tabData.accept(FuzzyModItems.OI_OI_OI.get());
			})

					.build());
}
