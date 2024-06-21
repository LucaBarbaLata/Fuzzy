
package net.mcreator.fuzzy.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CodModel;

import net.mcreator.fuzzy.entity.AquaticSheepEntity;

public class AquaticSheepRenderer extends MobRenderer<AquaticSheepEntity, CodModel<AquaticSheepEntity>> {
	public AquaticSheepRenderer(EntityRendererProvider.Context context) {
		super(context, new CodModel(context.bakeLayer(ModelLayers.COD)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AquaticSheepEntity entity) {
		return new ResourceLocation("fuzzy:textures/entities/sheep.png");
	}
}
