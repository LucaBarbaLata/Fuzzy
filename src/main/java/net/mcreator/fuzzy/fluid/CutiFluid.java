
package net.mcreator.fuzzy.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.fuzzy.init.FuzzyModItems;
import net.mcreator.fuzzy.init.FuzzyModFluids;
import net.mcreator.fuzzy.init.FuzzyModFluidTypes;
import net.mcreator.fuzzy.init.FuzzyModBlocks;

public abstract class CutiFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> FuzzyModFluidTypes.CUTI_TYPE.get(), () -> FuzzyModFluids.CUTI.get(), () -> FuzzyModFluids.FLOWING_CUTI.get()).explosionResistance(100f)
			.bucket(() -> FuzzyModItems.CUTI_BUCKET.get()).block(() -> (LiquidBlock) FuzzyModBlocks.CUTI.get());

	private CutiFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.EXPLOSION;
	}

	public static class Source extends CutiFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends CutiFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
