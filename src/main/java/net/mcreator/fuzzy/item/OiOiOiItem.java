
package net.mcreator.fuzzy.item;

import net.minecraft.network.chat.Component;

public class OiOiOiItem extends RecordItem {

	public OiOiOiItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fuzzy:oioioi")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1240);
	}

}
