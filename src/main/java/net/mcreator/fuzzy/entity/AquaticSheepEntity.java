
package net.mcreator.fuzzy.entity;

import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.nbt.Tag;
import net.minecraft.network.syncher.EntityDataAccessor;

public class AquaticSheepEntity extends PathfinderMob {

	public AquaticSheepEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(FuzzyModEntities.AQUATIC_SHEEP.get(), world);
	}

	public AquaticSheepEntity(EntityType<AquaticSheepEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 0;
		setNoAi(false);

		this.setPathfindingMalus(BlockPathTypes.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (AquaticSheepEntity.this.isInWater())
					AquaticSheepEntity.this.setDeltaMovement(AquaticSheepEntity.this.getDeltaMovement().add(0, 0.005, 0));

				if (this.operation == MoveControl.Operation.MOVE_TO && !AquaticSheepEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - AquaticSheepEntity.this.getX();
					double dy = this.wantedY - AquaticSheepEntity.this.getY();
					double dz = this.wantedZ - AquaticSheepEntity.this.getZ();

					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * AquaticSheepEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());

					AquaticSheepEntity.this.setYRot(this.rotlerp(AquaticSheepEntity.this.getYRot(), f, 10));
					AquaticSheepEntity.this.yBodyRot = AquaticSheepEntity.this.getYRot();
					AquaticSheepEntity.this.yHeadRot = AquaticSheepEntity.this.getYRot();

					if (AquaticSheepEntity.this.isInWater()) {
						AquaticSheepEntity.this.setSpeed((float) AquaticSheepEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());

						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						AquaticSheepEntity.this.setXRot(this.rotlerp(AquaticSheepEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(AquaticSheepEntity.this.getXRot() * (float) (Math.PI / 180.0));

						AquaticSheepEntity.this.setZza(f3 * f1);
						AquaticSheepEntity.this.setYya((float) (f1 * dy));
					} else {
						AquaticSheepEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					AquaticSheepEntity.this.setSpeed(0);
					AquaticSheepEntity.this.setYya(0);
					AquaticSheepEntity.this.setZza(0);
				}
			}
		};

	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new WaterBoundPathNavigation(this, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();

		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false) {

			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}

		});
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(5, new FloatGoal(this));

	}

	@Override
	public MobType getMobType() {
		return MobType.WATER;
	}

	protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
		super.dropCustomDeathLoot(source, looting, recentlyHitIn);
		this.spawnAtLocation(new ItemStack(Blocks.LIGHT_BLUE_WOOL));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public boolean hurt(DamageSource damagesource, float amount) {
		if (damagesource.is(DamageTypes.FALL))
			return false;
		if (damagesource.is(DamageTypes.DROWN))
			return false;
		if (damagesource.is(DamageTypes.EXPLOSION) || damagesource.is(DamageTypes.PLAYER_EXPLOSION))
			return false;
		return super.hurt(damagesource, amount);
	}

	@Override
	public boolean ignoreExplosion() {
		return true;
	}

	@Override
	public boolean checkSpawnObstruction(LevelReader world) {
		return world.isUnobstructed(this);
	}

	@Override
	public boolean canBreatheUnderwater() {
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level();
		Entity entity = this;
		return true;
	}

	@Override
	public boolean isPushedByFluid() {
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level();
		Entity entity = this;
		return false;
	}

	public static void init() {
		SpawnPlacements.register(FuzzyModEntities.AQUATIC_SHEEP.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getBlockState(pos).is(Blocks.WATER) && world.getBlockState(pos.above()).is(Blocks.WATER)));

	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.4);
		builder = builder.add(Attributes.MAX_HEALTH, 15);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);

		builder = builder.add(ForgeMod.SWIM_SPEED.get(), 0.4);

		return builder;
	}

}
