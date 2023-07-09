package xiaochangsama.bettertouch.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DamageProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level, event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(entity.getX(), entity.getY() + 1, entity.getZ()))).getBlock() == Blocks.WALL_TORCH
				|| (world.getBlockState(BlockPos.containing(entity.getX(), entity.getY() + 1, entity.getZ()))).getBlock() == Blocks.TORCH
				|| (world.getBlockState(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()))).getBlock() == Blocks.TORCH
				|| (world.getBlockState(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()))).getBlock() == Blocks.WALL_TORCH) {
			{
				Entity _entToDamage = entity;
				_entToDamage.hurt(new DamageSource(_entToDamage.level.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.HOT_FLOOR)), 1);
			}
		}
		if ((world.getBlockState(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()))).getBlock() == Blocks.SMALL_AMETHYST_BUD
				|| (world.getBlockState(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()))).getBlock() == Blocks.MEDIUM_AMETHYST_BUD
				|| (world.getBlockState(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()))).getBlock() == Blocks.LARGE_AMETHYST_BUD
				|| (world.getBlockState(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()))).getBlock() == Blocks.AMETHYST_CLUSTER) {
			{
				Entity _entToDamage = entity;
				_entToDamage.hurt(new DamageSource(_entToDamage.level.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.CACTUS)), 1);
			}
		}
		if ((world.getBlockState(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()))).getBlock() == Blocks.POINTED_DRIPSTONE) {
			{
				Entity _entToDamage = entity;
				_entToDamage.hurt(new DamageSource(_entToDamage.level.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.CACTUS)), 1);
			}
		}
		if ((world.getBlockState(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()))).getBlock() == Blocks.STONECUTTER) {
			{
				Entity _entToDamage = entity;
				_entToDamage.hurt(new DamageSource(_entToDamage.level.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.CACTUS)), 1);
			}
		}
	}
}
