package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.TrashBinBaggedTileEntity;

public class TrashBinBaggedBlockModel extends AnimatedGeoModel<TrashBinBaggedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TrashBinBaggedTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/trash_bin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashBinBaggedTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/trash_bin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashBinBaggedTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/empty_trash_bin.png");
	}
}
