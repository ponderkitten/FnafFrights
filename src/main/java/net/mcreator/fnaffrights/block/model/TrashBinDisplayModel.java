package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.TrashBinDisplayItem;

public class TrashBinDisplayModel extends AnimatedGeoModel<TrashBinDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(TrashBinDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/trash_bin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashBinDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/trash_bin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashBinDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/bagged_trash_bin.png");
	}
}
