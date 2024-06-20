
package net.mcreator.fuzzy.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CowModel;

import net.mcreator.fuzzy.entity.MossheepEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class MossheepRenderer extends MobRenderer<MossheepEntity, CowModel<MossheepEntity>> {
	public MossheepRenderer(EntityRendererProvider.Context context) {
		super(context, new CowModel(context.bakeLayer(ModelLayers.COW)), 0.5f);
		this.addLayer(new RenderLayer<MossheepEntity, CowModel<MossheepEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("fuzzy:textures/entities/cow.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, MossheepEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(MossheepEntity entity) {
		return new ResourceLocation("fuzzy:textures/entities/cow.png");
	}
}
