
package net.mcreator.fuzzy.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.OcelotModel;

import net.mcreator.fuzzy.entity.LabushaEntity;

public class LabushaRenderer extends MobRenderer<LabushaEntity, OcelotModel<LabushaEntity>> {
	public LabushaRenderer(EntityRendererProvider.Context context) {
		super(context, new OcelotModel(context.bakeLayer(ModelLayers.OCELOT)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LabushaEntity entity) {
		return new ResourceLocation("fuzzy:textures/entities/labusha.png");
	}
}
