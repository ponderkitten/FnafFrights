package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.BurntMangleDisplayItem;

public class BurntMangleDisplayModel extends AnimatedGeoModel<BurntMangleDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BurntMangleDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/mangle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BurntMangleDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/mangle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BurntMangleDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/image.png");
	}
}
