
package net.mcreator.fuzzy.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.fuzzy.init.FuzzyModFluids;

public class CutiItem extends BucketItem {
	public CutiItem() {
		super(FuzzyModFluids.CUTI, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
