
package net.mcreator.fuzzy.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.ChickenModel;

import net.mcreator.fuzzy.entity.BianalEntity;

public class BianalRenderer extends MobRenderer<BianalEntity, ChickenModel<BianalEntity>> {
	public BianalRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BianalEntity entity) {
		return new ResourceLocation("fuzzy:textures/entities/bianal.png");
	}
}
