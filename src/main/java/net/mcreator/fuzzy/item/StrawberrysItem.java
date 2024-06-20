
package net.mcreator.fuzzy.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class StrawberrysItem extends Item {
	public StrawberrysItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE).food((new FoodProperties.Builder()).nutrition(5).saturationMod(5f).alwaysEat().build()));
	}
}