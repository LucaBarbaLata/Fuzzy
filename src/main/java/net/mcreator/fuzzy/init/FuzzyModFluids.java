
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fuzzy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.fuzzy.fluid.CutiFluid;
import net.mcreator.fuzzy.FuzzyMod;

public class FuzzyModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, FuzzyMod.MODID);
	public static final RegistryObject<FlowingFluid> CUTI = REGISTRY.register("cuti", () -> new CutiFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_CUTI = REGISTRY.register("flowing_cuti", () -> new CutiFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(CUTI.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_CUTI.get(), RenderType.translucent());
		}
	}
}
