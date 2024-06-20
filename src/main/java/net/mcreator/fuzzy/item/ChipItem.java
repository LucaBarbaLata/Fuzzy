
package net.mcreator.fuzzy.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class ChipItem extends Item {
	public ChipItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return -1;
	}
}
