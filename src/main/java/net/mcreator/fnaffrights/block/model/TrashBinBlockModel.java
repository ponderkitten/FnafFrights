package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.TrashBinTileEntity;

public class TrashBinBlockModel extends AnimatedGeoModel<TrashBinTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TrashBinTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/trash_bin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashBinTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/trash_bin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashBinTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/bagged_trash_bin.png");
	}
}
