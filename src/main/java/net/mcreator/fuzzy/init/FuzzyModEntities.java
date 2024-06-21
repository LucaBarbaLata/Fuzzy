
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fuzzy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.fuzzy.entity.MossheepEntity;
import net.mcreator.fuzzy.entity.LabushaEntity;
import net.mcreator.fuzzy.entity.BianalEntity;
import net.mcreator.fuzzy.entity.AquaticSheepEntity;
import net.mcreator.fuzzy.FuzzyMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FuzzyModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, FuzzyMod.MODID);
	public static final RegistryObject<EntityType<BianalEntity>> BIANAL = register("bianal",
			EntityType.Builder.<BianalEntity>of(BianalEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BianalEntity::new).fireImmune().sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<LabushaEntity>> LABUSHA = register("labusha",
			EntityType.Builder.<LabushaEntity>of(LabushaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LabushaEntity::new)

					.sized(0.6f, 0.7f));
	public static final RegistryObject<EntityType<MossheepEntity>> MOSSHEEP = register("mossheep",
			EntityType.Builder.<MossheepEntity>of(MossheepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MossheepEntity::new)

					.sized(0.9f, 1.4f));
	public static final RegistryObject<EntityType<AquaticSheepEntity>> AQUATIC_SHEEP = register("aquatic_sheep",
			EntityType.Builder.<AquaticSheepEntity>of(AquaticSheepEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AquaticSheepEntity::new)

					.sized(0.5f, 0.3f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			BianalEntity.init();
			LabushaEntity.init();
			MossheepEntity.init();
			AquaticSheepEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(BIANAL.get(), BianalEntity.createAttributes().build());
		event.put(LABUSHA.get(), LabushaEntity.createAttributes().build());
		event.put(MOSSHEEP.get(), MossheepEntity.createAttributes().build());
		event.put(AQUATIC_SHEEP.get(), AquaticSheepEntity.createAttributes().build());
	}
}
