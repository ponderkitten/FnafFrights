package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.BonnieTorsoDisplayItem;

public class BonnieTorsoDisplayModel extends AnimatedGeoModel<BonnieTorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BonnieTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredbonnietorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredbonnietorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieTorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_bonnie.png");
	}
}
