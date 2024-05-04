
package net.mcreator.fnaffrights.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;

import javax.annotation.Nullable;

public class PuppetwalldecorBlock extends BaseEntityBlock implements EntityBlock {
	public static final IntegerProperty ANIMATION = IntegerProperty.create("animation", 0, (int) 1);
	public static final DirectionProperty FACING = DirectionalBlock.FACING;

	public PuppetwalldecorBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1f, 10f).noCollission().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));

		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public RenderShape getRenderShape(BlockState state) {
		return RenderShape.ENTITYBLOCK_ANIMATED;
	}

	@Nullable
	@Override
	public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
		return FnafFrightsModBlockEntities.PUPPETWALLDECOR.get().create(blockPos, blockState);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {

		return switch (state.getValue(FACING)) {
			default -> box(0, 0.1, 0, 16, 16, 16);
			case NORTH -> box(0, 0.1, 0, 16, 16, 16);
			case EAST -> box(0, 0.1, 0, 16, 16, 16);
			case WEST -> box(0, 0.1, 0, 16, 16, 16);
			case UP -> box(0, 0, 0.1, 16, 16, 16);
			case DOWN -> box(0, 0, 0, 16, 16, 15.9);
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(ANIMATION, FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getNearestLookingDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

}
