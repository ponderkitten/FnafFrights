package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FullTrashBinTileEntity;

public class FullTrashBinBlockModel extends AnimatedGeoModel<FullTrashBinTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FullTrashBinTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/trash_bin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FullTrashBinTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/trash_bin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FullTrashBinTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/full_trash_bin.png");
	}
}
