
package net.mcreator.fuzzy.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class CuteCreaturesItem extends RecordItem {
	public CuteCreaturesItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fuzzy:cutecreatures")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2800);
	}
}
