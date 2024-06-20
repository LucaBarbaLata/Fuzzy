
package net.mcreator.fuzzy.item;

import net.minecraft.network.chat.Component;

public class CuteCreaturesItem extends RecordItem {

	public CuteCreaturesItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fuzzy:cutecreatures")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2800);
	}

}
