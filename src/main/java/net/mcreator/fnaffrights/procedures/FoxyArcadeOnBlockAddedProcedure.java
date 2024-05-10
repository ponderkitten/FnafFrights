package net.mcreator.fnaffrights.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class FoxyArcadeOnBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		FnafFrightsMod.queueServerWork(200, () -> {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = FnafFrightsModBlocks.FOXY_ARCADE.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
			if (((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof Player _player) {
				ItemStack _setstack = new ItemStack(FnafFrightsModItems.TICKET.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		});
		FnafFrightsMod.queueServerWork(10, () -> {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_frights:coin")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_frights:coin")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		});
		FnafFrightsMod.queueServerWork(160, () -> {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_frights:printing")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_frights:printing")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		});
	}
}
