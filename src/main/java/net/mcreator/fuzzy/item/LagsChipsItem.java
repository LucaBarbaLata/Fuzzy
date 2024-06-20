
package net.mcreator.fuzzy.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class LagsChipsItem extends Item {
	public LagsChipsItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(9).saturationMod(1.1f).alwaysEat().build()));
	}
}
