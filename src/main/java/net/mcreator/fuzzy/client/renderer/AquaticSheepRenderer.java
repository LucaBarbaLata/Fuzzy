
package net.mcreator.fuzzy.client.renderer;

public class AquaticSheepRenderer extends MobRenderer<AquaticSheepEntity, CodModel<AquaticSheepEntity>> {

	public AquaticSheepRenderer(EntityRendererProvider.Context context) {
		super(context, new CodModel(context.bakeLayer(ModelLayers.COD)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(AquaticSheepEntity entity) {
		return new ResourceLocation("fuzzy:textures/entities/sheep.png");
	}

}
