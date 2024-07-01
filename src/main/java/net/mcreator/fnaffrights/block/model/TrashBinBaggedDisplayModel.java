package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.TrashBinBaggedDisplayItem;

public class TrashBinBaggedDisplayModel extends AnimatedGeoModel<TrashBinBaggedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(TrashBinBaggedDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/trash_bin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashBinBaggedDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/trash_bin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashBinBaggedDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/empty_trash_bin.png");
	}
}
