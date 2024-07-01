package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FullTrashBinDisplayItem;

public class FullTrashBinDisplayModel extends AnimatedGeoModel<FullTrashBinDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FullTrashBinDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/trash_bin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FullTrashBinDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/trash_bin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FullTrashBinDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/full_trash_bin.png");
	}
}
